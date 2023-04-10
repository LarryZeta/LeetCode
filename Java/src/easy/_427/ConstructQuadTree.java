package easy._427;

import definition.Node;

/**
 * @author Larry
 *
 * We want to use quad trees to store an N x N boolean grid. Each cell in the grid can only be true or false. The root node represents the whole grid. For each node, it will be subdivided into four children nodes until the values in the region it represents are all the same.
 *
 * Each node has another two boolean attributes : isLeaf and val. isLeaf is true if and only if the node is a leaf node. The val attribute for a leaf node contains the value of the region it represents.
 *
 * Your task is to use a quad tree to represent a given grid. The following example may help you understand the problem better:
 *
 * Given the 8 x 8 grid below, we want to construct the corresponding quad tree:
 *
 *
 *
 * It can be divided according to the definition above:
 *
 *
 *
 *
 *
 * The corresponding quad tree should be as following, where each node is represented as a (isLeaf, val) pair.
 *
 * For the non-leaf nodes, val can be arbitrary, so it is represented as *.
 *
 *
 *
 * Note:
 *
 *      1. N is less than 1000 and guaranteened to be a power of 2.
 *      2. If you want to know more about the quad tree, you can refer to its wiki.
 */

// TODO
public class ConstructQuadTree {

    public Node construct(int[][] grid) {

        Node root = new Node();

        //construct(root, grid, new Coordinate(0, 0), new Coordinate(grid[0].length - 1, grid.length - 1);

        return root;

    }

    class Coordinate {

        int x;
        int y;

        Coordinate(int x, int y) { this.x = x; this.y = y; }

    }

    Node construct(Node root , int[][] grid, Coordinate topleft, Coordinate butright) {

        
        return null;
    }

}
