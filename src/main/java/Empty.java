public class Empty {
    MainRun mr=new MainRun();
    boolean isEmpty(int roomNo){
        if("EMPTY".equalsIgnoreCase(mr.getRoom()[roomNo/100-1][roomNo%100-1]))
            return true;
        else
            return false;
    }
}
