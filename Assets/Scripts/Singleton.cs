using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public abstract class Singleton<T> : MonoBehaviour where T : MonoBehaviour
{
    public static T Instance { get; protected set; }

    private void Awake()
    {
       SetSingleton();
    }

    protected abstract void SetSingleton();
}

public abstract class SingletonDestroy<T> : Singleton<T> where T : MonoBehaviour
{
    protected override void SetSingleton()
    {
        Instance = this as T;
    }
}
public abstract class SingletonDontDestroy<T> : Singleton<T> where T : MonoBehaviour
{
    protected override void SetSingleton()
    {
        if (Instance == null)
        {
            Instance = this as T;
            DontDestroyOnLoad(this.gameObject);
        }
        else
        {
            Destroy(this.gameObject);
        }
    }
}