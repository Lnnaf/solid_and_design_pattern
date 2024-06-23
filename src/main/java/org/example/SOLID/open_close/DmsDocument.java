package org.example.SOLID.open_close;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DmsDocument {
    private Long docId;
    private String docName;
    private String docType;

    public abstract void upload();
    public abstract void download();
    public abstract void delete();
    public abstract void getList();
}
