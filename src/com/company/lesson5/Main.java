package com.company.lesson5;

public abstract class Main {
    public static void main(String[] args) {


        Employees[] pesrArray = new Employees[5];
        pesrArray[0] = new Employees("Tikhonov Vyacheslav Vladimirovich", "Data-Engineer", "TihVV@mail.ru", 88005553555l, 200000,40);
        pesrArray[1] = new Employees("Timofeev Alexander Sergeevich ", "Unity-developer",  "TimoA@rambler.ru", 88005554555l, 120000, 41);
        pesrArray[2] = new Employees("Govorkov Petr Vasilievich", "Game Analyst", "PVGovor@gmail.com", 88005556555l, 150000,42);
        pesrArray[3] = new Employees("Bratskiy Danil Bagrov", "3D-artist", "DanilBagrov@mail.ru", 880005557555l, 170000, 39);
        pesrArray[4] = new Employees("Alexander Alexandrovich Bely","Android-developer","AlexandrWhite@gmail.com",88001231233l, 180000, 33);


        for (int i = 0; i < pesrArray.length; i++) {
            if (pesrArray[i].getAge() > 40) {
                pesrArray[i].getInformationEmployee();
            }
        }



    }






}

