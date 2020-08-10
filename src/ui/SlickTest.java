package ui;
import org.newdawn.slick.*;
public class SlickTest extends BasicGame{

    public SlickTest(String title){                   //有個標題
        super(title);                               //標題方法
    }
    public static void main(String []args) throws SlickException{
        AppGameContainer app = new AppGameContainer(new SlickTest("SlickTest")); //新增APP物件 並設定標題
        
        app.setDisplayMode(800, 600, false);    //設定解析度
        app.setAlwaysRender(true);              //渲染開啟
        
        app.start();                            //開始
    }
    public void init(GameContainer gc) throws SlickException {
    }
    public void update(GameContainer gc, int i) throws SlickException {
        Input input = gc.getInput();
        
    }
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {
    }
}
