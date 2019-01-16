import entity.Device;

/**
 * create by ${user} on ${date}
 */
public class Test {

    public static void main(String[] args){
        if (args[0].equals("device")){
            try {
                int number = Integer.valueOf(args[1]);
                Device device = null;
                for(int i = 0;i<number;i++){
                    device = new Device("i"+i,"zhangsan"+i,"hgfjfgjg"+i,"chuangtou"+i,"abc"+i);
                    System.out.println(device);
                }
            }catch (StringIndexOutOfBoundsException e){
                e.printStackTrace();
            }finally {
                System.out.println("请输入有效数字！");
            }

        }
    }
}
