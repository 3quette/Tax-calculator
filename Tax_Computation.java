public class Tax_Computation{
    static double price;
    static double basicRate=0.04;
    static double luxuryRate=0.1;
    static double Luxury_tax;
    static double Basic_tax;
  static void computeCostBasic(){
            Basic_tax= price+basicRate;
  }
  static void computeCostLuxury(){
            Luxury_tax= price+luxuryRate;
  }
  static void changeBasicRateTo(double newBasicRate){
           basicRate= newBasicRate;
  }
  static void changeLuxuryRateTo(double newLuxuryRate){
           luxuryRate= newLuxuryRate;
  }
  static void roundToNearestvalue(){
        System.out.println("Basic Tax Rate is: "+Math.round(Basic_tax));
        System.out.println("Luxury Tax Rate is: "+Math.round(Luxury_tax));
  }
public static void main(String[] args){
    Tax_Computation obj=new Tax_Computation();
    obj.price=100.0;
    computeCostBasic();
    computeCostLuxury();
    changeBasicRateTo(0.03);
    changeLuxuryRateTo(0.2);
    roundToNearestvalue();
}
}