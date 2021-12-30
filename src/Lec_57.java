interface Mycamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("good MORNING");
    }
    default void record4kVideo(){
        greet();
        System.out.println("recording in 4K......!!!!");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String Network);
}
class MyCellPhone{
    void callNumber(int PhoneNumber){
        System.out.println("calling"+PhoneNumber);
        }
    void pickCall(){
        System.out.println("connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements Mycamera,MyWifi{
    public void takeSnap(){
        System.out.println("taking Snap11111");
    }
    public void recordVideo(){
        System.out.println("TAKING SNAP2222...!!");
    }
//    public void record4kVideo(){
//        System.out.println("Taking snap and recording in 4K");
//    }
    public String[] getNetworks(){
        System.out.println("GETTING LIST ODF NETWORKS....");
        String[] networkList = {"BSNL","JIO","V!"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to "+network);
    }
}
public class Lec_57 {
    public static void main(String[] args) {
    MySmartPhone ms = new MySmartPhone();
    ms.record4kVideo();
    //ms.greet();
    String[] ar = ms.getNetworks();
    for(String item:ar){
        System.out.println(item);
    }
    }
}







