package ui;
public class Year {
    static String FTian;
    static String FDi;
    static String Language = "Chinese";
    public Year() {//1804 甲子
    }
    public void culc(int year) {
        final int y = -10016; //1804
        int n;
        if (year - y >=0 ){
            n = year -y;
        } else{
            n = y - year;
        }
        int Tian = n +1;
        int Di = n +1 ;
        String FTian = "";
        String FDi = "";
        while (Tian > 10 || Di > 12) {
            if (Tian > 10) {
                Tian -= 10;
            }
            if (Di > 12) {
                Di -= 12;
            }
        }
        if (Language == "Chinese"){
            switch (Tian) {
                case 1:
                    FTian = "甲";
                    break;
                case 2:
                    FTian = "乙";
                    break;
                case 3:
                    FTian = "丙";
                    break;
                case 4:
                    FTian = "丁";
                    break;
                case 5:
                    FTian = "戊";
                    break;
                case 6:
                    FTian = "己";
                    break;
                case 7:
                    FTian = "庚";
                    break;
                case 8:
                    FTian = "辛";
                    break;
                case 9:
                    FTian = "壬";
                    break;
                case 10:
                    FTian = "癸";
                    break;
            }
            switch (Di) {
                case 1:
                    FDi = "子";
                    break;
                case 2:
                    FDi = "丑";
                    break;
                case 3:
                    FDi = "寅";
                    break;
                case 4:
                    FDi = "卯";
                    break;
                case 5:
                    FDi = "辰";
                    break;
                case 6:
                    FDi = "巳";
                    break;
                case 7:
                    FDi = "午";
                    break;
                case 8:
                    FDi = "未";
                    break;
                case 9:
                    FDi = "申";
                    break;
                case 10:
                    FDi = "酉";
                    break;
                case 11:
                    FDi = "戌";
                    break;
                case 12:
                    FDi = "亥";
                    break;
            }
        } else if(Language == "English"){
            switch (Tian) {
                    case 1:
                        FTian = "One";
                        break;
                    case 2:
                        FTian = "Two";
                        break;
                    case 3:
                        FTian = "Three";
                        break;
                    case 4:
                        FTian = "Four";
                        break;
                    case 5:
                        FTian = "Five";
                        break;
                    case 6:
                        FTian = "Six";
                        break;
                    case 7:
                        FTian = "Seven";
                        break;
                    case 8:
                        FTian = "Eight";
                        break;
                    case 9:
                        FTian = "Night";
                        break;
                    case 10:
                        FTian = "Ten";
                        break;
                }
                switch (Di) {
                    case 1:
                        FDi = "Rat";
                        break;
                    case 2:
                        FDi = "Cow";
                        break;
                    case 3:
                        FDi = "Tiger";
                        break;
                    case 4:
                        FDi = "Rabit";
                        break;
                    case 5:
                        FDi = "Dragon";
                        break;
                    case 6:
                        FDi = "Snake";
                        break;
                    case 7:
                        FDi = "Horse";
                        break;
                    case 8:
                        FDi = "Sheep";
                        break;
                    case 9:
                        FDi = "Monkey";
                        break;
                    case 10:
                        FDi = "Chicken";
                        break;
                    case 11:
                        FDi = "Dog";
                        break;
                    case 12:
                        FDi = "Pig";
                        break;
                }
        }
        this.FTian = FTian;
        this.FDi = FDi;
    }
}
