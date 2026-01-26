package variable;

public class VariableDemo2 {
    static void main() {

/*
               我方：叉子         对方：长手
               攻击：220          攻击：210
               防御：85           防御：80
               血量：1012.5       血量：1223.3
               技能加成：1.2      技能加成：1.3
               技能造成伤害的公式：攻击力 * 技能加成 - 对方防御力
               普攻造成伤害的公式：攻击力 - 对方防御力
               计算：
                   我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
                   我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
                   规则：经常发生改变的数据，用变量记录          */
        int attck1=220;
        int attck2=210;
        int def1=85;
        int def2=80;
        double hp1=1012.5;
        double hp2=1223.3;
        double skillAdd1=1.2;
        double skillAdd2=1.3;
        double damage1=attck1-def2;
        hp2=hp2-damage1;
        System.out.println(hp2);
        double damage2=attck1*skillAdd1-def2;
        hp2=hp2-damage2;
        System.out.println(hp2);
    }
}
