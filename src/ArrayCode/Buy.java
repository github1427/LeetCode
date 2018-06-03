package ArrayCode;

import java.util.HashMap;
import java.util.Map;

public class Buy {
    public static void main(String[] args) {
        int me=2500;
        String situation;
        String idea="夏天买双板鞋穿";
        String action="逛淘宝";
        Map<String,Integer> shoppingCart=new HashMap<>();

        //action。。。。。。
        int shoes1=1800;
        idea="这双鞋不仅好看还耐脏,还就剩我的号了，贼喜欢，尼玛也太贵了，不舍得，纠结纠结";
        shoppingCart.put("shoes1",1800);
        situation="一星期过后，我的号没了";
        idea="不行，好想要，要不我少吃点肉要了吧，偷偷的，再找找这款还有我的号没";
        shoes1=2600;
        idea="尼玛，2600，买不起！！！，贫穷！！！,我怂了还不行";
        shoppingCart.remove("shoes1");
        int shoes2=800;
        idea="省钱了省钱了，诶，让别人帮我看了看这款也行,但看起来不好清理，纠结,懒惰限制了我的穿着，别的没相中，就这个吧";
        shoppingCart.put("shoes2",800);
        idea="既然买了双白鞋，配个黑色束脚裤岂不是美滋滋";
        int pants=600;
        idea="为何我的眼光跟我的钱包如此不符，淘宝你别给我推荐这么贵的让我相中行不行，推荐个200的让我相中多好";
        idea="眼里容不下其他的裤子了，就这个吧，再少吃两天肉。";
        shoppingCart.put("pants",600);
        idea="鞋和裤子都有了，再配个背心完美啊，noah不错，boy也不错，emmmmmm";
        int noah=500;
        int boy=500;
        idea="好贵啊，先把购物车结了，容我纠结纠结";
        for (String goods:shoppingCart.keySet()){
            me=me-shoppingCart.get(goods);
        }
        if ((me-500)>=1000){
            idea="买买买，买买买，都少吃很多肉了，大不了不吃了呗，减肥减肥";
        }else {
            idea="尼玛，卡里跌破4位数，啊啊啊啊啊啊啊，不可以，以后怎么请美女吃饭看电影，算了算了,穿得再帅不也没人看，忍一忍，还要留钱去浪";
        }
        System.out.println("现在的我还有"+me);
        System.out.println("小康的我------------>贫穷的我");
    }
}
