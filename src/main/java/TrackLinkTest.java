//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class TrackLinkTest {
//
//  public List<Packing> generatePackingData(String topParentSerial, List<Tree> trees) {
//    HashMap<String, String> parentVsChildMapping = new HashMap<>();
//    HashMap<String, Packing> packingIsvPackingObj = new HashMap<>();
//
//
//    return getPackings(trees, parentVsChildMapping, packingIsvPackingObj)
//  }
//
//
//  public List<Packing> getPackings(List<Tree> trees, HashMap<String, String> parentVsChildMapping, HashMap<String, Packing> packingIsvPackingObj,) {
//    Map<String, List<Packing>> packingIdVsListOfPacking = new HashMap<>();
//
//    List<Packing> packings = new ArrayList<>();
//    for (Tree tree : trees) {
//      //get Tree
//      // check if tree id is present in parentVsChildMapping , fetch parent id
//
//
//    }
//    return packings;
//  }
//
//
//  public Packing getPacking(Tree tree, HashMap<String, String> parentVsChildMapping, HashMap<String, Packing> packingIsvPacing, int depth) {
//    Packing packing = new Packing();
//    packing.setParentNUmber(tree.parent);
//    packing.setDepth(depth);
//
//
//  }
//
//}
//
//
////  Read all trees
////1 Read first tree  and fetch it's parent number
//// Map <Child, Parent> parentMapping
//// Map<Child, Packing Object> childVsPackingObject
//Packing . parent null
//Packing.childId = 138888130000001476
//Packing.Depht =0
//Packing.label = getLabe(depth)
//{
//
//}
//
//  childVsPackingObject.put(138888130000001476, packing1);
//  parentMapping.put()
//
//
//
//
//
//
//// check parent is existing for this in parentVsChildMapping , if not than this is first Packing create new object
//// Packing.parent = null
//// Packing.child = null
//// Packing.id = someId
//// Pakcing.depth =1;
//// put into parentVsChildMapping and
//// put parenNumber, Packing object
//
//
//// Read second Parent
//// check if tree.parent number in parentVsChildMapping than first is there and create a Packing newPacking
//// Fetch parent = parentVsChildMapping.get("newPacking.id")
//// set newParent.parent = parent
//// parent.addChild = newChild
//// newPacking.depth = parent.depth+1;
//// newPacking.label = getBalebByDepth()
///// This will comes in loop in recusrision
//
//
////finally return list of packing object
//
//
////
////
////String getLabelByDepht(int depht){
////
////}
//
//<tree>
//<pack_number>138888130000001476</pack_number>
//<parent_pack_number>338888130000000657</parent_pack_number>
//
//Map<PackiNumb, List<Parent>>
//
//</tree>
//Packing .parent = 338888130000000657
//packing.child = 138888130000001476
//packing.depht = 0
//pacrentMapping()
//mapingMap(138888130000001476, Packing)
//
//
//<tree>
//<pack_number>138888130000001483</pack_number>
//<parent_pack_number>338888130000000657</parent_pack_number>
//</tree>
//
//
//
//<tree>
//<product_number>04602103001760TS8BMDTY850F4</product_number>
//<parent_pack_number>138888130000001476</parent_pack_number>
//</tree>
//<tree>
//<product_number>04602103001760CPXS57ZNWVTFY</product_number>
//<parent_pack_number>138888130000001476</parent_pack_number>
//</tree>
//<tree>
//<product_number>04602103001760VTC95ZRPZV647</product_number>
//<parent_pack_number>138888130000001483</parent_pack_number>
//</tree>
//<tree>
//<product_number>04602103001760MWGRVBY4Y7AAD</product_number>
//<parent_pack_number>138888130000001483</parent_pack_number>
//</tree>
