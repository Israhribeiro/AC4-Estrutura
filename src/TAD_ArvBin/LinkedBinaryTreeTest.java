package TAD_ArvBin;

import TAD_ArvGen.LinkedTree;
import TAD_ArvGen.TreeNode;
import org.junit.jupiter.api.Test;
import position.NodePositionList;
import position.Position;
import position.PositionList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedBinaryTreeTest {
    @Test
    public void test(){
        LinkedBinaryTree<Character> T = new LinkedBinaryTree<Character>();
        T = T.buildExpression("((((3+1)*3)/((9-5)+2))-((3*(7-4))+6))");
        assertEquals(-13.0,T.evaluateExpression(T,(BTPosition) T.root()));

        T.inorder(T,(BTPosition) T.root());

        System.out.println();

        T.binaryPreOrder(T,(BTPosition) T.root());

        System.out.println();

        T.binaryPosOrder(T,(BTPosition) T.root());

        System.out.println();

        T.printExpression(T,(BTPosition) T.root());

        System.out.println();

        T.drawTree(T,(BTPosition) T.root(),0);
    }
}
