package org.vcell;

import net.imagej.Dataset;

import javax.swing.*;

/**
 * Created by kevingaffney on 7/6/17.
 */
public class ConstructTIRFGeometryInputPanel extends TIRFInputPanel {

    private JSpinner spnSliceIndex;
    private JComboBox<Dataset> cmbData;

    public ConstructTIRFGeometryInputPanel(Dataset[] data) {
        super();

        spnSliceIndex = new JSpinner(new SpinnerNumberModel());
        cmbData = new JComboBox<>(data);

        add(new JLabel("Slice Index"));
        add(spnSliceIndex);
        add(new JLabel("Data"));
        add(cmbData);
    }

    public Integer getSliceIndex() {
        return (Integer) spnSliceIndex.getValue();
    }

    public Dataset getData() {
        return (Dataset) cmbData.getSelectedItem();
    }
}