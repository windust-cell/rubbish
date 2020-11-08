public class Experiment{
    public static void main(String[] args) {
        Jingdong jingdong=new Jingdong();
        Consumer consumer=new Consumer();
        System.out.println("妈妈，我想买电脑");
        consumer.sleep();
        System.out.println("买，买两台，两台够吗");
        consumer.sleep();
        System.out.println("够了");
        consumer.sleep();
        Consumer.makeaOrder(jingdong,"R70000");
        jingdong.sleep();
        jingdong.receiveOrder();
        jingdong.sleep();
        jingdong.expressDelivery();
        jingdong.sleep();
        consumer.receiveExpress();
        consumer.sleep();
        Consumer.buyComputer(jingdong,999);
        consumer.sleep();
        System.out.println("谢谢妈妈，妈妈真好");
    }
}