using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class GameManager : SingletonDontDestroy<GameManager>
{
    private void Start()
    {
        TMPValue.Instance.DontDestroyText(x, y, z);
    }

    public int x;
    public int y;
    public int z;


    private void Update()
    {
        TMPValue.Instance.DontDestroyText(x, y, z);
        if (Input.GetKeyDown(KeyCode.Space))
        {
            SceneManager.LoadScene(0);
        }
    }
}