package com.sergio994350.aboutmeapp.ui.about;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutMeViewModel extends ViewModel {
    String textAboutMe = "Родился я в маленьком сибирском городке, где нормальной погодой зимой считалось -35'C. Иногда занятия в школе отменяли из-за морозов, и все, конечно, шли кататься на горке! Но все это ничуть не помешало мне закончить школу с медалью, Московский Горный Университет с красным дипломом, два раза жениться и стать отцом троих сыновей :)\n\nОкончание ВУЗа пришлось на 90-е, так что диплом горняка оказался не так полезен, как умение хорошо продавать и договариваться с людьми. И я стал продавать окорочка в компании \\\"Союзконтракт\\\". А потом посуду и сковородки, мебель и мебельные комплектующие, сигнализации.\nСловом, 23 года - с 1997 по 2020 - я занимался продажами.\n\nВ 2020 году я увлекся программированием на Java и Android, и решил сделать это своей профессией. Окончил курсы \\\"Java-разработчик\\\" в компании SkillBox, курсы по Android и Kotlin от Асель Романовой из Университета ИТМО и JetBrains Academy, несколько курсов по Java и Android на проекте Udemy, занимался самообразованием. \nМне нравится делать жизнь людей удобнее, будь это продажа мебели  или создание качественных удобных приложений на Android.";

    private MutableLiveData<String> mText;

    public AboutMeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(textAboutMe);
    }

    public LiveData<String> getText() {
        return mText;
    }
}
