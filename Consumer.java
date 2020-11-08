public class Consumer {
    public static void makeaOrder(BuyCo shop,String name){
        Order order=shop.makeaOrder(name);
        System.out.println("妈妈对两台"+order.name+"下订单");
    }
    public  void receiveExpress(){
        System.out.println("妈妈收到慢递");
    }
    public static void buyComputer(BuyCo shop, int money){
        Computer computer=shop.buycomputer(money);
        System.out.println("孩子拿到了"+computer.name);
    }
    public void sleep(){
        try
        {
            Thread.currentThread().sleep(1000);//毫秒
        }
        catch(Exception e){}
    }
}
