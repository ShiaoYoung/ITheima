package ObjectOriented;

import java.util.Random;

public class WenZiGeDou {
    private String name;   //姓名
    private int blood;     //血量
    private char gender;   //性别
    private String face;   //面相

    //女生长相数组
    private String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //男生长相数组
    private String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};

    //attack 攻击描述：
    private String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"};

    //injured 受伤描述：
    private String[] injureds_desc = {
            "结果%s退了半步，毫发无损。",
            "结果给%s造成一处瘀伤。",
            "结果一击命中，%s痛得弯下腰。",
            "结果%s痛苦地闷哼了一声，显然受了点内伤。",
            "结果%s摇摇晃晃，一跤摔倒在地。",
            "结果%s脸色一下变得惨白，连退了好几步。",
            "结果『轰』的一声，%s口中鲜血狂喷而出。",
            "结果%s一声惨叫，像滩软泥般塌了下去。"
    };


    public WenZiGeDou() {
    }

    public void attack(WenZiGeDou role){
        Random random = new Random();

        //攻击方式
        int attackWay = random.nextInt(attacks_desc.length);
        System.out.printf(attacks_desc[attackWay], this.name, role.name);

        //攻击值1~20
        int attackIndex = random.nextInt(20) + 1;
        int remainBlood = role.getBlood() - attackIndex;
        role.setBlood(remainBlood);

        //受伤程度
        //血量> 90 0索引的描述
        //80 ~  90  1索引的描述
        //70 ~  80  2索引的描述
        //60 ~  70  3索引的描述
        //40 ~  60  4索引的描述
        //20 ~  40  5索引的描述
        //10 ~  20  6索引的描述
        //小于10的   7索引的描述

        if (role.getBlood() >= 90){
            System.out.printf(injureds_desc[0],role.getName());
        } else if (role.getBlood() < 90 && role.getBlood() >= 80) {
            System.out.printf(injureds_desc[1],role.getName());
        }else if (role.getBlood() < 80 && role.getBlood() >= 70) {
            System.out.printf(injureds_desc[2],role.getName());
        }else if (role.getBlood() < 70 && role.getBlood() >= 60) {
            System.out.printf(injureds_desc[3],role.getName());
        }else if (role.getBlood() < 60 && role.getBlood() >= 40) {
            System.out.printf(injureds_desc[4],role.getName());
        }else if (role.getBlood() < 40 && role.getBlood() >= 20) {
            System.out.printf(injureds_desc[5],role.getName());
        }else if (role.getBlood() < 20 && role.getBlood() >= 10) {
            System.out.printf(injureds_desc[6],role.getName());
        }else if (role.getBlood() < 10 && role.getBlood() >= 0) {
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();
    }

    public void showRoleInfo(){
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getFace());
    }

    public String getFace() {
        return face;
    }

    public void setFace() {
        Random random = new Random();
        int Index = random.nextInt(boyfaces.length);
        if (gender == '男'){
            this.face = boyfaces[Index];
        } else if (gender == '女') {
            this.face = girlfaces[Index];
        }else {
            this.face = "惨不忍睹";
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        if (blood >= 0 && blood <= 100){
            this.blood = blood;
        } else if (blood < 0) {
            this.blood = 0;
        }
    }
}
