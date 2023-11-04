using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class LevelManager : SingletonDestroy<LevelManager>
{
    // Start is called before the first frame update
    void Start()
    {
        TMPValue.Instance.DestroyText(x, y, z);
    }

    // Update is called once per frame
    void Update()
    {
        TMPValue.Instance.DestroyText(x, y, z);
    }

    public int x;
    public int y;
    public int z;
}