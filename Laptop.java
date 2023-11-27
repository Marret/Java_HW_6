public class Laptop {

    private String brand; // Бренд (brand)
    private String series;// Серия (series)
    private String name;// Нименование (name)
    private String colour; // Цвет (colour)
    private String operatingSystem; // Операционная система (operatingSystem)
    private String typeOfRAM;// Тип ОЗУ (typeOfRAM)
    private int capacityRAM;// Обьем ОЗУ (capacityRAM)
    private int hardDiskCapacity;// Объем ЖД (hardDiskCapacity)
    private String videoCard;// Видео карта (videoCard)
    private String processor;// Процессор (processor)
    private double сompatibility;// Стоимость (сompatibility)

    public Laptop(String brand, String series, String name, String colour, String operatingSystem, String typeOfRAM,
            int capacityRAM, int hardDiskCapacity, String videoCard, String processor, double сompatibility) {
        this.brand = brand;
        this.series = series;
        this.name = name;
        this.colour = colour;
        this.operatingSystem = operatingSystem;
        this.typeOfRAM = typeOfRAM;
        this.capacityRAM = capacityRAM;
        this.hardDiskCapacity = hardDiskCapacity;
        this.videoCard = videoCard;
        this.processor = processor;
        this.сompatibility = сompatibility;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getSeries() {
        return series;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getTypeOfRAM() {
        return typeOfRAM;
    }

    public int getCapacityRAM() {
        return capacityRAM;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getProcessor() {
        return processor;
    }
    public double getCompatibility() {
        return сompatibility;
    }
    @Override
    public String toString(){
          return "Бренд = "+brand +"\nСерия = "+series+"\nНаименование = "+name+"\nЦвет = "+colour+"\nОперационая система = "+operatingSystem+"\nТип ОЗУ = "+typeOfRAM+"\nОбьем ОЗУ = "+capacityRAM+" ГБ"+"\nОбьем ЖД = "+hardDiskCapacity+" ГБ"+"\nВидео карта = "+videoCard+"\nПроцессор = "+processor+"\nСтоимость = "+сompatibility+" Руб.";
    }
   

}

    