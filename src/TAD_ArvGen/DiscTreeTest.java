package TAD_ArvGen;

import org.junit.jupiter.api.Test;
import position.NodePositionList;
import position.Position;
import position.PositionList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscTreeTest {
    @Test
    public void test(){
        TreePosition<DiscNode> raiz;
        TreePosition<DiscNode> cs16, cs252;
        PositionList<Position<DiscNode>> filhos;
        LinkedTree<DiscNode> T = criarDiretoriosT();

        raiz = T.root();

        assertEquals(5124, T.diskSpace(T,raiz), "cs16/");
    }

    private static TreeNode<DiscNode> criarFilho(TreeNode<DiscNode> p, DiscNode node, String name, int kbytes) {
        PositionList<Position<DiscNode>> filhos;
        TreeNode<DiscNode> aux;

        filhos = p.getChildren();

        aux = new TreeNode<DiscNode>();
        aux.setElement(node);
        aux.element().setName(name);
        aux.element().setKbytes(kbytes);
        aux.setParent(p);
        aux.setChildren(new NodePositionList<Position<DiscNode>>());
        filhos.addLast(aux);
        return aux;
    }

    public static LinkedTree<DiscNode> criarDiretoriosT() {
        LinkedTree<DiscNode> T = new LinkedTree<DiscNode>();
        TreeNode<DiscNode> raiz, cs16, cs252, tms, prgms, proj, tbs, dms;

        T.addRoot(new DiscNode());
        raiz = (TreeNode<DiscNode>) T.root();
        raiz.element().setName("usuarios/rt/cursos");
        raiz.element().setKbytes(1);
        raiz.setChildren(new NodePositionList<Position<DiscNode>>());

        cs16 = criarFilho(raiz,new DiscNode(),"cs016/",2);
        cs252 = criarFilho(raiz,new DiscNode(),"cs252/",1);

        criarFilho(cs16,new DiscNode(),"notas",8);
        tms = criarFilho(cs16,new DiscNode(),"temas/",1);
        prgms = criarFilho(cs16,new DiscNode(),"programas/",1);

        criarFilho(tms,new DiscNode(),"hw1",3);
        criarFilho(tms,new DiscNode(),"hw2",2);
        criarFilho(tms,new DiscNode(),"hw3",4);

        criarFilho(prgms,new DiscNode(),"pr1",57);
        criarFilho(prgms,new DiscNode(),"pr2",97);
        criarFilho(prgms,new DiscNode(),"pr3",74);

        criarFilho(cs252,new DiscNode(),"notas",3);
        proj = criarFilho(cs252,new DiscNode(),"projetos/",1);

        tbs = criarFilho(proj,new DiscNode(),"trabalhos/",1);
        dms = criarFilho(proj,new DiscNode(),"demos/",1);


        criarFilho(tbs,new DiscNode(),"compre baixo",26);
        criarFilho(tbs,new DiscNode(),"venda alto",55);

        criarFilho(dms,new DiscNode(),"mercado",4786);

        return T;
    }
}
