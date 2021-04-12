import processing.core.PApplet;

public class TryProcessingOops extends PApplet {
    DerivedOops deri = new DerivedOops(680,480,10);
    public static void main(String args[])
    {
        PApplet.main("TryProcessingOops",args);
    }
    @Override
    public void settings()
    {
        super.settings();
        size(deri.getWIDTH(),deri.getHEIGHT());
    }
    @Override
    public void draw()
    {
        drawCircle();
    }
    int x[]={1,1,1,1};
    private void drawCircle() {
        for(int i=0;i<4;i++)
        {
            ellipse(x[i],(i+1)*deri.getHEIGHT()/5,deri.getDIAMETER(),deri.getDIAMETER());
            x[i]+=(i+1);
        }
    }


}
