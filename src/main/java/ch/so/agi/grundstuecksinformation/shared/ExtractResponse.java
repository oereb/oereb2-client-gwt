package ch.so.agi.grundstuecksinformation.shared;


import com.google.gwt.user.client.rpc.IsSerializable;

import ch.so.agi.grundstuecksinformation.shared.models.RealEstateDPR;

public class ExtractResponse implements IsSerializable {
    private RealEstateDPR realEstateDPR;

    public RealEstateDPR getRealEstateDPR() {
        return realEstateDPR;
    }

    public void setRealEstateDPR(RealEstateDPR realEstateDPR) {
        this.realEstateDPR = realEstateDPR;
    }
}
