package abc;
public class PC {
    CPU c;
    HardDisk d;
    public PC() {
    }
    public void setCPU(CPU cpu) {
        this.c=cpu;
    }
    public void setHardDisk(HardDisk disk) {
        this.d=disk;
    }
    public void show(){
        System.out.println( "CPU���ٶ�Ϊ:" + c.getspeed() + ",Ӳ�̵�����Ϊ:" + d.getAmount());
    }
}