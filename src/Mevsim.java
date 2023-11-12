//C#dan farklı olarak enumlar bir sabit sınıf örnekleri içeren bir türdür diyebiliriz. Enumlar values() metodu çağrıalrak örneklenebilir.
//Enumlar sadece bir kez ve ilk çağrıldığında örneklenir.
//Static blokları sırayla çalışır.
public enum Mevsim {
    ilkbahar,
    sonbahar,
    yaz,
    kis;
    //Aslında static bloklar c# daki static ctorlardır. Yani sınıflar newlenmeden çalışmaz.
    static{
        System.out.println("Sadık");

    }
    //Birden fazla static block açılabailir.
    static{
        //Mevsim.values();
        System.out.println("F");
    }
    public static Mevsim IsMevsim(String mevsim){
        for (Mevsim m : Mevsim.values()){
              if(m.name().equals(mevsim)){
                  System.out.println("Bulundu : " + m.name());
                  return m;
              }
        }
        return null;
    }

    public void Print(){
        System.out.println("Ben "+this.name()+" mevsimyim");
    }
    private final int Id;
    public int Id() {return Id;}
    Mevsim(){
         System.out.println("Tahiri");
         this.Id = 1;
    }
}
