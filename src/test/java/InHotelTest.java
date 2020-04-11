import org.easymock.EasyMock;
import org.junit.Test;


class InHotelTest {




    @Test
    public void testIn() {
        IData mock= EasyMock.createMock(IData.class);
        InHotel inHotel=new InHotel(mock);
        EasyMock.expect(inHotel.in(101,"张三")).andReturn("张三成功入住101房间");
        EasyMock.replay(mock);
        EasyMock.verify(mock);
    }
}