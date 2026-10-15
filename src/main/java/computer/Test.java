package computer;

import computer.adapter.HdmiVgaAdapter;
import computer.adapter.HdmiVgaAdapterH;

public class Test {
    public static void main(String[] args) {
        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setVga(new Ecran());
        uniteCentral.print("Bonjour");

        uniteCentral.setVga(new VideoProjecteur());
        uniteCentral.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentral.setVga(hdmiVgaAdapter);
        uniteCentral.print("Bonjour");

        uniteCentral.setVga(new SuperVP());
        uniteCentral.print("HELLO");

        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentral.setVga(hdmiVgaAdapter1);
        uniteCentral.print("HELLO");

        HdmiVgaAdapterH hdmiVgaAdapterH = new HdmiVgaAdapterH();
        uniteCentral.setVga(hdmiVgaAdapterH);
        uniteCentral.print("TEST");

    }
}
