package com.sergio994350.aboutmeapp.ui.contacts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactsViewModel extends ViewModel {
    String textContacts =
            "Сергей Тарасов\n" +
            "tarasov-mnm@yandex.ru\n" +
            "+7(915)198-2794 \n" +
            "telegram: @sergio994350\n" +
            "github.com/Sergio994350";
    private MutableLiveData<String> mText;

    public ContactsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(textContacts);
    }

    public LiveData<String> getText() {
        return mText;
    }
}
