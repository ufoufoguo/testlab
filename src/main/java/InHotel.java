
public class InHotel {//extends Empty{
//    private int room;
//    public String in(int roomNo,String name){
//        MainRun mr=new MainRun();
//        room=roomNo%100-1;
//        if(isEmpty(roomNo)){
//            mr.getRoom()[roomNo/100-1][room]=name;
//            return name+"成功入住"+roomNo+"房价";
//        }else{
//            return "该房间已经有人入住";
//        }
//    }
    private IData iData=null;
    InHotel(){
        iData =new IData();
    }
    InHotel(IData i) {
        iData=i;
    }
    public String in(int roomNo,String name){
        return iData.in_out_room(roomNo, name);
    }

}
