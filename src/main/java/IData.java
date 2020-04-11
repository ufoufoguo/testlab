public class IData {
    private int room;
    MainRun mr=new MainRun();
    public String in_out_room(int roomNo,String name){
        MainRun mr=new MainRun();
        room=roomNo%100-1;
        if(isEmpty(roomNo)){
            mr.getRoom()[roomNo/100-1][room]=name;
            return name+"成功入住"+roomNo+"房间";
        }else{
            return "该房间已经有人入住";
        }
    }
    boolean isEmpty(int roomNo){
        if("EMPTY".equalsIgnoreCase(mr.getRoom()[roomNo/100-1][roomNo%100-1]))
            return true;
        else
            return false;
    }

}
