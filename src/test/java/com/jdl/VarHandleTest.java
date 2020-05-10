package com.jdl;

import com.jdl.varhandle.MyTree;
import org.junit.jupiter.api.Test;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VarHandleTest {

    @Test
    public void accessAndModifyPrivateVariable() throws NoSuchFieldException, IllegalAccessException {

        MyTree tree = new MyTree(10.5f);
        VarHandle varHandleTreeSize = MethodHandles
                .privateLookupIn(MyTree.class, MethodHandles.lookup())
                .findVarHandle(MyTree.class, "size", float.class);


        assertEquals(10.5f, varHandleTreeSize.get(tree));

        varHandleTreeSize.set(tree, 9.0f);

        assertEquals(9.0f, varHandleTreeSize.get(tree));
    }
}
