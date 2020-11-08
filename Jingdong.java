public  class Jingdong implements BuyCo{
    @Override
    public void receiveOrder() {
        System.out.println("京东店铺接收到了订单");
    }

    @Override
    public Order makeaOrder(String name) {
        return new Order(name);
    }

    @Override
    public void expressDelivery() {
        System.out.println("京东慢递已发货");
    }


    @Override
    public Computer buycomputer(int money) {
        return new Computer("京东店铺消费"+money+"元买到的两台R70000");
    }
    public void sleep(){
        try
        {
            Thread.currentThread().sleep(1000);//毫秒
        }
        catch(Exception e){}
    }
}
