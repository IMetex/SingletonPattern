using System;
using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;

public class TMPValue : SingletonDestroy<TMPValue>
{
    [Header("DontDestroy")] public TMP_Text _data1;
    public TMP_Text _data2;
    public TMP_Text _data3;


    [Header("Destroy")] public TMP_Text _data4;
    public TMP_Text _data5;
    public TMP_Text _data6;


    public void DontDestroyText(int value, int value2, int value3)
    {
        _data1.text = value.ToString();
        _data2.text = value2.ToString();
        _data3.text = value3.ToString();
    }

    public void DestroyText(int value, int value2, int value3)
    {
        _data4.text = value.ToString();
        _data5.text = value2.ToString();
        _data6.text = value3.ToString();
    }
}