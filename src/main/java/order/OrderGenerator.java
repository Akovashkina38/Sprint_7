package Order;

public class OrderGenerator {


    public static Order getWithBlack(){
        return new Order("Саша","Аковаша","пр. Культуры, 20","4","+78003553535","5","2022-12-12","Позвонить за час до приезда", new String[]{"BLACK"});
    }

    public static Order getWithGrey(){
        return new Order("Саша","Аковаша","пр. Культуры, 20","4", "+78003553535",  "5","2022-12-12","Позвонить за час до приезда", new String[]{"GREY"});
    }

    public static Order getWithBlackAndGrey(){
        return new Order("Саша","Аковаша","пр. Культуры, 20","4","+78003553535","5","2022-12-12","Позвонить за час до приезда",new String[]{"BLACK", "GREY"});
    }

    public static Order getWithoutColours(){
        return new Order("Саша","Аковаша","пр. Культуры, 20","4","+78003553535","5","2022-12-12","Позвонить за час до приезда",null);
    }


}
