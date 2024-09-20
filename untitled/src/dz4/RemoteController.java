package dz4;

public class RemoteController implements Remote_Controller {
    private TVHD tv;
    private Channel cha;
    private int lastChannelIndex;
    private int lastProgramIndex;

    public RemoteController(TVHD tv,Channel cha) {
        this.cha = cha;
        this.tv = tv;
        this.lastChannelIndex = -1;
        this.lastProgramIndex = -1;
    }

    @Override
    public void setChannel(int number) {
        lastChannelIndex = tv.getCurrentChannelIndex();
        tv.setChannelByNumber(number);
    }

    @Override
    public void nextChannel() {
        lastChannelIndex = tv.getCurrentChannelIndex();
        tv.nextChannel();
    }

    @Override
    public void previousChannel() {
        lastChannelIndex = tv.getCurrentChannelIndex();
        tv.previousChannel();
    }

    @Override
    public void nextProgram() {
        tv.getCurrentChannel().nextProgram();
        lastProgramIndex = cha.getCurrentProgramIndex();
        cha.nextProgram();
    }

    @Override
    public void previousProgram() {
        tv.getCurrentChannel().previousProgram();
        lastChannelIndex = cha.getCurrentProgramIndex();
        cha.previousProgram();
    }
}
