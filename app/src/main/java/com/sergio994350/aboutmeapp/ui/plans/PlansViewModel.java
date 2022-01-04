package com.sergio994350.aboutmeapp.ui.plans;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PlansViewModel extends ViewModel {
    String textPlans =
            "Я намерен развивать навыки в Android-разработке,\n" +
            "написании приложений на Kotlin и Java.\n\n" +
            "В 2022 году я очень хотел бы начать работу в одной из \n" +
            "уважаемых IT-компаний, которые мне очень нравятся:\n" +
            "Яндекс, JetBrains, EPAM или другой.\n" +
            "Я четко понимаю свою цель и стремлюсь к ней\n" +
            "изо всех сил.\n";

    private MutableLiveData<String> mText;

    public PlansViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(textPlans);
    }

    public LiveData<String> getText() {
        return mText;
    }
}
