package com.example.lab2_zdunpawel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class FragsData extends ViewModel {
    public final MutableLiveData<Integer> counter = new MutableLiveData<>(0);
}