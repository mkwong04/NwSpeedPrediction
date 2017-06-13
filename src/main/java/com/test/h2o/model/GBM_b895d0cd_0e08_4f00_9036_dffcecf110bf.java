package com.test.h2o.model;
import hex.genmodel.GenModel;
import hex.genmodel.annotations.ModelPojo;

@ModelPojo(name="gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf", algorithm="gbm")
public class GBM_b895d0cd_0e08_4f00_9036_dffcecf110bf extends GenModel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public hex.ModelCategory getModelCategory() { return hex.ModelCategory.Multinomial; }

  public boolean isSupervised() { return true; }
  public int nfeatures() { return 4; }
  public int nclasses() { return 3; }

  // Names of columns used by model.
  public static final String[] NAMES = NamesHolder_gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf.VALUES;
  // Number of output classes included in training data response column.
  public static final int NCLASSES = 3;

  // Column domains. The last array contains domain of response column.
  public static final String[][] DOMAINS = new String[][] {
    /* Zip Code */ null,
    /* High Speed Internet Plan */ gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_1.VALUES,
    /* Connection Type */ gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_2.VALUES,
    /* Prime Time? */ gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_3.VALUES,
    /* Download Speed Classification */ gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_4.VALUES
  };
  // Prior class distribution
  public static final double[] PRIOR_CLASS_DISTRIB = {0.31720174320132455,0.2398424267798352,0.44295583001884026};
  // Class distribution used for model building
  public static final double[] MODEL_CLASS_DISTRIB = {0.31720174320132455,0.2398424267798352,0.44295583001884026};

  public GBM_b895d0cd_0e08_4f00_9036_dffcecf110bf() { super(NAMES,DOMAINS); }
  public String getUUID() { return Long.toString(-4535310551404528520L); }

  // Pass in data in a double[], pre-aligned to the Model's requirements.
  // Jam predictions into the preds[] array; preds[0] is reserved for the
  // main prediction (class for classifiers or value for regression),
  // and remaining columns hold a probability distribution for classifiers.
  public final double[] score0( double[] data, double[] preds ) {
    java.util.Arrays.fill(preds,0);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_0.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_1.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_2.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_3.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_4.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_5.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_6.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_7.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_8.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_9.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_10.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_11.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_12.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_13.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_14.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_15.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_16.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_17.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_18.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_19.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_20.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_21.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_22.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_23.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_24.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_25.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_26.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_27.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_28.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_29.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_30.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_31.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_32.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_33.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_34.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_35.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_36.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_37.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_38.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_39.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_40.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_41.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_42.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_43.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_44.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_45.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_46.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_47.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_48.score0(data,preds);
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_49.score0(data,preds);
    hex.genmodel.GenModel.GBM_rescale(preds);
    preds[0] = hex.genmodel.GenModel.getPrediction(preds, PRIOR_CLASS_DISTRIB, data, 0.5);
    return preds;
  }
}
// The class representing training column names
class NamesHolder_gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf implements java.io.Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static final String[] VALUES = new String[4];
  static {
    NamesHolder_gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_0.fill(VALUES);
  }
  static final class NamesHolder_gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_0 implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static final void fill(String[] sa) {
      sa[0] = "Zip Code";
      sa[1] = "High Speed Internet Plan";
      sa[2] = "Connection Type";
      sa[3] = "Prime Time?";
    }
  }
}
// The class representing column High Speed Internet Plan
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_1 implements java.io.Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static final String[] VALUES = new String[4];
  static {
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_1_0.fill(VALUES);
  }
  static final class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_1_0 implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static final void fill(String[] sa) {
      sa[0] = "HIS 100 Mbps";
      sa[1] = "HIS 40 Mbps";
      sa[2] = "HIS 60 Mbps";
      sa[3] = "HIS 80 Mbps";
    }
  }
}
// The class representing column Connection Type
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_2 implements java.io.Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static final String[] VALUES = new String[3];
  static {
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_2_0.fill(VALUES);
  }
  static final class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_2_0 implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static final void fill(String[] sa) {
      sa[0] = "Dedicated";
      sa[1] = "Telephone landline";
      sa[2] = "Virtual-Circuit";
    }
  }
}
// The class representing column Prime Time?
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_3 implements java.io.Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static final String[] VALUES = new String[2];
  static {
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_3_0.fill(VALUES);
  }
  static final class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_3_0 implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static final void fill(String[] sa) {
      sa[0] = "N";
      sa[1] = "Y";
    }
  }
}
// The class representing column Download Speed Classification
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_4 implements java.io.Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static final String[] VALUES = new String[3];
  static {
    gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_4_0.fill(VALUES);
  }
  static final class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_ColInfo_4_0 implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static final void fill(String[] sa) {
      sa[0] = "80 % - > 95%";
      sa[1] = "< 80%";
      sa[2] = "> 95%";
    }
  }
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_0 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_0_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_0_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_0_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_0_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.1f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.11543858f : 
                        0.12259193f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.09874999f : 
                        0.11351673f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.08581729f : 
                        0.103139f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.06874999f : 
                        0.07414187f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.038888894f : 
                        -0.034330238f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.05555556f : 
                        -0.0397281f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.0132653f : 
                        0.027228909f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.015446524f : 
                        0.0067677884f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.12004404f : 
                        0.0963455f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.11978608f : 
                        0.111482546f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.07550431f : 
                        0.054347817f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.0986928f : 
                        0.08420167f)))));
    return pred;
  } // constant pool size = 158B, number of visited nodes = 24, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {9, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_0_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.1f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.1f : 
                        -0.08957346f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.096453905f : 
                        -0.07958237f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.060823534f : 
                        -0.04250145f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.032126702f : 
                        -0.017035402f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.1f : 
                        -0.08653251f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.09273128f : 
                        -0.07272728f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.05503259f : 
                        -0.04144635f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.033256356f : 
                        -0.020608904f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.03237951f : 
                        0.047773644f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.051667295f : 
                        0.06452741f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.11397334f : 
                        0.12721087f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.117783f : 
                        0.124686174f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_0_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.07956094f : 
                        -0.082618155f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        -0.08086487f : 
                        -0.07622479f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06151286f : 
                        -0.055260755f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.06711384f : 
                        -0.07129522f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.023120733f : 
                        -0.01311476f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.03659794f : 
                        -0.024019612f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.035632625f : 
                        -0.031699352f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.04420181f : 
                        -0.036314156f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.019193552f : 
                        -0.0055319206f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.027472531f : 
                        -0.019378433f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.040740743f : 
                        -0.058471076f) : 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        -0.046933964f : 
                        -0.03707094f))) : 
            0.19999997f));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_1 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_1_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_1_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_1_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_1_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.09503717f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.09863781f : 
                        0.104287855f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.08445268f : 
                        0.09701748f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.0740635f : 
                        0.08923553f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.059662856f : 
                        0.064417504f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.03453344f : 
                        -0.029489499f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.05156802f : 
                        -0.036115076f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.011945091f : 
                        0.024249697f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.008679542f : 
                        0.017844403f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.10270292f : 
                        0.08227309f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.10209214f : 
                        0.09514487f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.065571964f : 
                        0.047240134f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.08519496f : 
                        0.0726809f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_1_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.09503717f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.09564663f : 
                        -0.09529421f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.08583807f : 
                        -0.07036141f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.056460965f : 
                        -0.039141003f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.029197996f : 
                        -0.0153183285f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.095716245f : 
                        -0.095240615f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.08248207f : 
                        -0.057592675f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.05607246f : 
                        -0.040052682f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.035252724f : 
                        -0.02192341f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.028740196f : 
                        0.042011954f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.045380656f : 
                        0.05631488f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.09725441f : 
                        0.10799828f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.0995592f : 
                        0.105586536f)))));
    return pred;
  } // constant pool size = 158B, number of visited nodes = 24, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_1_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.07481122f : 
                        -0.0778418f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        -0.07612383f : 
                        -0.071424745f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.052569043f : 
                        -0.058006365f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.066328146f : 
                        -0.06243525f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.020622142f : 
                        -0.011299537f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.033733547f : 
                        -0.021795915f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.032870766f : 
                        -0.028672613f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.034914386f : 
                        -0.040466815f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.018850265f : 
                        -0.009631968f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.030386476f : 
                        -0.021690631f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.037434425f : 
                        -0.05448183f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.03858072f : 
                        -0.029100195f))) : 
            0.16544242f));
    return pred;
  } // constant pool size = 158B, number of visited nodes = 24, static init size = 360B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {12, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {7, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {8, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {7, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {9, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_2 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_2_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_2_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_2_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_2_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.09089577f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.085421495f : 
                        0.09058292f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.07312365f : 
                        0.0838873f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.06454942f : 
                        0.078161016f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.05210397f : 
                        0.056314945f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.031065008f : 
                        -0.023832785f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.03661351f : 
                        -0.031942848f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.009701229f : 
                        0.020110747f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        6.5692635E-5f : 
                        0.015027821f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.08880584f : 
                        0.07164561f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.08855665f : 
                        0.08215483f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.059379157f : 
                        0.046235595f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.074190505f : 
                        0.063520566f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {3, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_2_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.09089577f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.091554f : 
                        -0.08040719f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.08803776f : 
                        -0.070582055f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.052490056f : 
                        -0.035995368f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.026463738f : 
                        -0.013690159f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.09156924f : 
                        -0.077432595f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.08427961f : 
                        -0.06359307f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0474457f : 
                        -0.035026997f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.027608784f : 
                        -0.01587703f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.025595099f : 
                        0.037169266f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.039881393f : 
                        0.049759135f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.08423633f : 
                        0.09340461f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.08673155f : 
                        0.09197562f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_2_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.0705743f : 
                        -0.07360458f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        -0.07197196f : 
                        -0.06717318f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.05361337f : 
                        -0.04726767f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.06229596f : 
                        -0.058500253f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.021835975f : 
                        -0.011219211f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.030564828f : 
                        -0.019130217f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.029941034f : 
                        -0.025877228f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.031956784f : 
                        -0.03720358f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0149644585f : 
                        -0.0025709511f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.022502717f : 
                        -0.014537678f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.034360442f : 
                        -0.050828066f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.035390224f : 
                        -0.026263213f))) : 
            0.14279136f));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {12, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {7, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_3 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_3_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_3_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_3_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_3_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.08741831f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.07667487f : 
                        0.08186008f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.06385138f : 
                        0.07362107f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.056631073f : 
                        0.069183506f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.045711555f : 
                        0.049497202f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.030640675f : 
                        -0.025901943f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.044609558f : 
                        -0.02930509f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.008820111f : 
                        0.018134665f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        1.8077657E-4f : 
                        0.013972972f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.078519665f : 
                        0.06238498f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.07765645f : 
                        0.07197276f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.050379347f : 
                        0.035322282f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.06533753f : 
                        0.055735607f)))));
    return pred;
  } // constant pool size = 168B, number of visited nodes = 24, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {3, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_3_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.08741831f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.08887168f : 
                        -0.088305816f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0782853f : 
                        -0.06197917f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0454825f : 
                        -0.030758465f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.023918973f : 
                        -0.0121629005f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.08890645f : 
                        -0.08823829f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.074720025f : 
                        -0.049335472f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.048882857f : 
                        -0.033989053f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.029336669f : 
                        -0.017436154f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.019492527f : 
                        0.029308513f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.035363823f : 
                        0.0440747f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.07419566f : 
                        0.079794094f) : 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.074878186f : 
                        0.08109378f)))));
    return pred;
  } // constant pool size = 158B, number of visited nodes = 24, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_3_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.066720046f : 
                        -0.06980434f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        -0.06821644f : 
                        -0.063300334f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.045329902f : 
                        -0.05087865f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.055070426f : 
                        -0.059167396f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.019448364f : 
                        8.630464E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.01410175f : 
                        -0.019504568f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.027073417f : 
                        -0.023085317f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.029208392f : 
                        -0.034224976f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.014236189f : 
                        -0.00577417f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.025130402f : 
                        -0.016963959f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.031499982f : 
                        -0.047455534f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.032408375f : 
                        -0.023636194f))) : 
            0.12692769f));
    return pred;
  } // constant pool size = 148B, number of visited nodes = 24, static init size = 300B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {8, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {7, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {9, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_4 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_4_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_4_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_4_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_4_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.08448473f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.066086285f : 
                        0.070560224f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.056109063f : 
                        0.064848f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.05011165f : 
                        0.061402433f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.0402635f : 
                        0.043531604f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.025077464f : 
                        -0.01822232f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.030410301f : 
                        -0.02565743f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.011907341f : 
                        0.019513337f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.011397218f : 
                        0.0050857007f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.06926454f : 
                        0.055091005f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.06878676f : 
                        0.06325869f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.04436294f : 
                        0.030839538f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.05773542f : 
                        0.04925811f)))));
    return pred;
  } // constant pool size = 158B, number of visited nodes = 24, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_4_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.08448473f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.08617738f : 
                        -0.085653245f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.075170904f : 
                        -0.058448814f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.039260726f : 
                        -0.022887632f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.019195272f : 
                        -0.0073097805f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.08585331f : 
                        -0.07032264f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.077944815f : 
                        -0.05593916f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.045538146f : 
                        -0.031232335f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.02666882f : 
                        -0.01562837f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.01642063f : 
                        0.027956972f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.02998753f : 
                        0.039112717f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.06889294f : 
                        0.06364043f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.06702335f : 
                        0.07160077f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_4_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.06322717f : 
                        -0.06634647f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        -0.0647406f : 
                        -0.05967243f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.04710471f : 
                        -0.040577684f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.051742226f : 
                        -0.05577508f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.017010191f : 
                        0.0022756902f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.01189395f : 
                        -0.016885059f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.024430698f : 
                        -0.020531833f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.026619054f : 
                        -0.03142389f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.012006989f : 
                        -0.0040335315f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.022542985f : 
                        -0.014666623f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.028804857f : 
                        -0.044324107f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.029795388f : 
                        -0.021208141f))) : 
            0.115301475f));
    return pred;
  } // constant pool size = 153B, number of visited nodes = 24, static init size = 330B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {8, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {7, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {9, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_5 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_5_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_5_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_5_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_5_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.082000144f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.058727287f : 
                        0.063017525f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.049516954f : 
                        0.05742827f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.044476163f : 
                        0.054873962f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.035456628f : 
                        0.03847779f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.02463947f : 
                        -0.020282306f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.038611293f : 
                        -0.023217382f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.008119704f : 
                        0.016248176f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.0060723755f : 
                        0.013319102f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.061924867f : 
                        0.04839686f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.061974138f : 
                        0.05764946f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        0.043012563f : 
                        0.032686193f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.051251613f : 
                        0.043683197f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_5_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.082000144f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.08390129f : 
                        -0.08343088f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.07235857f : 
                        -0.055142995f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.042743135f : 
                        -0.029943494f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.028574774f : 
                        -0.0143089285f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.08420495f : 
                        -0.08336296f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.06845884f : 
                        -0.04215602f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.042400867f : 
                        -0.028661106f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.024189316f : 
                        -0.013961038f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.015315614f : 
                        0.02346211f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.028238764f : 
                        0.034755208f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.058031555f : 
                        0.06315226f) : 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.058538716f : 
                        0.06404084f)))));
    return pred;
  } // constant pool size = 158B, number of visited nodes = 24, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {6, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_5_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.05991941f : 
                        -0.06314845f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        -0.061473906f : 
                        -0.05639994f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.044535186f : 
                        -0.03709182f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.04729121f : 
                        -0.05265323f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.014828607f : 
                        -0.0050829416f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.023083212f : 
                        -0.012128354f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.021911621f : 
                        -0.018062374f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.024204176f : 
                        -0.028829219f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.00991573f : 
                        -0.0023510887f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.016237194f : 
                        -0.008675633f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.029577056f : 
                        -0.039601643f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.023820942f : 
                        -0.028624123f))) : 
            0.106493995f));
    return pred;
  } // constant pool size = 158B, number of visited nodes = 24, static init size = 360B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {5, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {7, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_6 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_6_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_6_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_6_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_6_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.079888366f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.054040723f : 
                        0.058602635f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.043681186f : 
                        0.051185485f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.037643667f : 
                        0.046213098f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.031412803f : 
                        0.03406385f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.019671114f : 
                        -0.013130924f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.024921443f : 
                        -0.020034533f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.009933016f : 
                        0.01597957f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.009697007f : 
                        0.004726046f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.05546197f : 
                        0.043095402f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.055513866f : 
                        0.051204577f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.036333755f : 
                        0.026865952f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.045648098f : 
                        0.038834944f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {9, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_6_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.079888366f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.081781074f : 
                        -0.067724936f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.07758495f : 
                        -0.056805f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.033748325f : 
                        -0.018206824f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.015422292f : 
                        -0.004525453f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.081780925f : 
                        -0.064413086f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.072924726f : 
                        -0.04925798f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.037997853f : 
                        -0.02597993f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.018614076f : 
                        -0.008281473f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.01303816f : 
                        0.022707356f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.023973875f : 
                        0.031073729f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.055006262f : 
                        0.04993034f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.052540764f : 
                        0.05687828f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_6_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.05688056f : 
                        -0.060160585f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.057317212f : 
                        -0.052417204f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.04136101f : 
                        -0.034824915f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.05070098f : 
                        -0.04632401f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.012604944f : 
                        0.0055198492f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.013768253f : 
                        -0.00867837f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.019574536f : 
                        -0.01581696f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.022010887f : 
                        -0.026334163f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.009379861f : 
                        -0.0029069486f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.014127047f : 
                        -0.0067112437f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.023947075f : 
                        -0.039158605f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.025003023f : 
                        -0.016331423f))) : 
            0.09965187f));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {9, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {7, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_7 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_7_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_7_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_7_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_7_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.078087695f : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.046803687f : 
                        0.05086366f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.03722647f : 
                        0.042247325f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.030672355f : 
                        0.053092115f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.027733874f : 
                        0.030209288f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.019279653f : 
                        -0.015322461f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.033204608f : 
                        -0.017799102f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.00550328f : 
                        0.012791519f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -5.206382E-4f : 
                        0.011963845f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.049985085f : 
                        0.03804581f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.04922786f : 
                        0.044197008f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.030818455f : 
                        0.019928431f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.04079716f : 
                        0.03462931f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {3, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_7_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.078087695f : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.08005527f : 
                        -0.062361095f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.043222375f : 
                        -0.032967664f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.03139326f : 
                        -0.015803497f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.012287682f : 
                        -0.0042328457f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.080752976f : 
                        -0.07985602f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.0631407f : 
                        -0.03571397f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.041638765f : 
                        -0.026416786f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.01999889f : 
                        -0.010633256f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.011749119f : 
                        0.020347636f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.021470517f : 
                        0.027785238f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.045303956f : 
                        0.049034152f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.05000174f : 
                        0.05465219f)))));
    return pred;
  } // constant pool size = 158B, number of visited nodes = 24, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {10, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_7_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.053955507f : 
                        -0.057339665f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.05441958f : 
                        -0.049502406f)) : 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.038311288f : 
                        -0.029786687f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.046055973f : 
                        -0.041501366f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.010542228f : 
                        -0.0014520872f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.018294943f : 
                        -0.008245287f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.017421026f : 
                        -0.013727818f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.01989666f : 
                        -0.024130808f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0060241795f : 
                        8.0544857E-4f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.012151981f : 
                        -0.0050448044f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.02186203f : 
                        -0.03660474f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.022794591f : 
                        -0.0144388955f))) : 
            0.0942309f));
    return pred;
  } // constant pool size = 158B, number of visited nodes = 24, static init size = 360B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {7, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {9, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_8 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_8_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_8_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_8_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_8_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.076547824f : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.041960455f : 
                        0.04589554f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.032846723f : 
                        0.03773382f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.02726384f : 
                        0.047962938f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.023780355f : 
                        0.026360247f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.014929678f : 
                        -0.008777587f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.02002397f : 
                        -0.015133095f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.008773305f : 
                        0.013024002f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        0.008616637f : 
                        0.00542166f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.045010943f : 
                        0.034015056f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.04491998f : 
                        0.04075092f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        0.030310264f : 
                        0.022092827f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.0365677f : 
                        0.03089243f)))));
    return pred;
  } // constant pool size = 158B, number of visited nodes = 24, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {11, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_8_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.076547824f : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.078647725f : 
                        -0.059933864f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.040292118f : 
                        -0.030273033f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.02895691f : 
                        -0.014092129f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.010868779f : 
                        -0.0035469716f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.078792356f : 
                        -0.059215914f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.06873737f : 
                        -0.043249864f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.047767356f : 
                        -0.028180294f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.019661063f : 
                        -0.009394732f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.010712474f : 
                        0.017016463f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.02039049f : 
                        0.024971668f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.040499352f : 
                        0.043992378f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.04497719f : 
                        0.049103618f)))));
    return pred;
  } // constant pool size = 153B, number of visited nodes = 24, static init size = 330B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {10, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_8_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.051188134f : 
                        -0.054660283f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        -0.052959833f : 
                        -0.047407445f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.036280263f : 
                        -0.029718572f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.044311844f : 
                        -0.04024552f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.01593804f : 
                        0.004746761f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.004179604f : 
                        -0.008576867f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.015395897f : 
                        -0.011822584f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.017975643f : 
                        -0.022073435f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0032449772f : 
                        0.0065102885f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.008627754f : 
                        -8.3801814E-4f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.015918583f : 
                        -0.0097017065f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.025355255f : 
                        -0.019725394f))) : 
            0.08986778f));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {12, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {3, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {13, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_9 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_9_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_9_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_9_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_9_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.07522751f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.039200794f : 
                        0.043274455f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.029907485f : 
                        0.03744755f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.02778278f : 
                        0.035575934f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.02125175f : 
                        0.02335295f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.012838812f : 
                        -0.009242464f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.022773178f : 
                        -0.010514945f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.009827707f : 
                        0.013985766f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.00599983f : 
                        0.009523882f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.041036222f : 
                        0.030007571f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.039825577f : 
                        0.034990773f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.02440385f : 
                        0.013538561f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.033733748f : 
                        0.025837706f)))));
    return pred;
  } // constant pool size = 168B, number of visited nodes = 24, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {13, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_9_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.07522751f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.077624746f : 
                        -0.060282316f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.07263515f : 
                        -0.048376773f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.026549315f : 
                        -0.012640928f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.010954793f : 
                        -0.0015483152f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.07815732f : 
                        -0.077260084f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.05841432f : 
                        -0.029929223f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.028302368f : 
                        -0.01788719f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.013493818f : 
                        -0.004362861f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.0093615865f : 
                        0.01666354f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.01730888f : 
                        0.022424264f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.036885813f : 
                        0.04073794f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.039838973f : 
                        0.043060664f)))));
    return pred;
  } // constant pool size = 173B, number of visited nodes = 24, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {3, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_9_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.05162775f : 
                        -0.048797213f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.04914005f : 
                        -0.04387086f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.03399108f : 
                        -0.027549705f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.04186885f : 
                        -0.037810005f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.006684317f : 
                        0.0013992976f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0113804f : 
                        -0.0029384997f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.013524883f : 
                        -0.01008014f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.016221436f : 
                        -0.020091955f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.00189815f : 
                        0.0072728978f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.006987867f : 
                        5.1360676E-4f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.012847955f : 
                        -0.0059260917f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -0.021566777f : 
                        -0.016805222f))) : 
            0.086310916f));
    return pred;
  } // constant pool size = 168B, number of visited nodes = 24, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {12, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {9, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_10 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_10_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_10_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_10_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_10_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
            -0.07409277f : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        0.033522252f : 
                        0.03711062f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.025876313f : 
                        0.030283969f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        0.018193275f : 
                        0.02191573f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.03804535f : 
                        0.013672644f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.010895272f : 
                        -0.005364896f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.015734175f : 
                        -0.0108890645f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.0064680823f : 
                        0.011655899f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.0044202968f : 
                        0.010413069f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.037048478f : 
                        0.026807724f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.03654878f : 
                        0.03246637f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.02157849f : 
                        0.012541379f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.02926075f : 
                        0.02469979f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_10_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.07653421f : 
                        -0.05816763f) : 
                    -0.07409277f) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.07292702f : 
                        -0.062087797f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[2])) ? 
                        -0.07409277f : 
                        -0.0306881f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.07409277f : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.030433675f : 
                        -0.014264374f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.012226996f : 
                        -0.0053037643f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.07654748f : 
                        -0.05446235f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.065098874f : 
                        -0.037768383f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.043119404f : 
                        -0.023840109f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.016090916f : 
                        -0.0069255074f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.005341006f : 
                        0.011698144f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.015152232f : 
                        0.020227937f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.033015475f : 
                        0.03666289f) : 
                     (data[0 /* Zip Code */] <100009.5f ? 
                        0.03852393f : 
                        0.036064684f)))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {10, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_10_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.048780136f : 
                        -0.05273102f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.047382142f : 
                        -0.043538857f)) : 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.031659376f : 
                        -0.022929588f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.03894508f : 
                        -0.034332965f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.0057408162f : 
                        0.0105300285f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.0065839323f : 
                        -0.0020110833f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.011821808f : 
                        -0.008389624f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.014643422f : 
                        -0.018349076f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0012792862f : 
                        0.0046399203f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.010732266f : 
                        -0.004066766f)) : 
                 (data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.021329625f : 
                        -0.008914932f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.024692012f : 
                        -0.0037218474f))) : 
            0.083380654f));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {9, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {7, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {8, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {7, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_11 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_11_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_11_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_11_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_11_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                -0.0731153f : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.073112495f : 
                        -0.07311544f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.07311244f : 
                        -0.07311544f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.03177708f : 
                        0.03535123f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.022078978f : 
                        0.028441643f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.015548209f : 
                        0.019913817f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.021127108f : 
                        0.013945237f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.009125825f : 
                        -0.0059074764f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.023550289f : 
                        -0.009029763f)) : 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.005597693f : 
                        0.011141041f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.004853249f : 
                        0.00766308f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.03364118f : 
                        0.023651045f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.032360412f : 
                        0.027623769f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.019189544f : 
                        0.00980685f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.02751306f : 
                        0.020452365f)))));
    return pred;
  } // constant pool size = 189B, number of visited nodes = 28, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {13, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_11_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.07557809f : 
                        -0.056146808f) : 
                    -0.07311544f) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.07174583f : 
                        -0.05997466f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[2])) ? 
                        -0.07311544f : 
                        -0.028308481f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.07311544f : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.02261094f : 
                        -0.010317989f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.007065006f : 
                        -8.322333E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.07620734f : 
                        -0.075285554f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.05407577f : 
                        -0.024740063f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0326393f : 
                        -0.018318571f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.012546397f : 
                        -0.0049640667f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.00907892f : 
                        0.0148171745f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.012393545f : 
                        0.01737076f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.029553307f : 
                        0.03300277f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                        0.032738395f : 
                        0.036357973f)))));
    return pred;
  } // constant pool size = 195B, number of visited nodes = 27, static init size = 510B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_11_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.046807546f : 
                        -0.043627087f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        -0.04565223f : 
                        -0.039499972f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.032579824f : 
                        -0.026592398f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.03869087f : 
                        -0.03428607f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.0036589f : 
                        0.0037805762f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.008557254f : 
                        -1.18953365E-4f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.010289296f : 
                        -0.0069924155f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.013123892f : 
                        -0.016741294f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        1.0412444E-5f : 
                        0.005581544f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.009169283f : 
                        -0.0014681056f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.013519747f : 
                        -0.0063995086f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -0.0227068f : 
                        -0.0032066077f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.08094542f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.080953754f : 
                        0.08103165f)) : 
                0.08094542f)));
    return pred;
  } // constant pool size = 185B, number of visited nodes = 27, static init size = 450B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {13, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {8, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_12 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_12_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_12_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_12_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_12_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.072272114f : 
                        -0.07226266f) : 
                    -0.07227211f) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.072272114f : 
                        -0.07226251f) : 
                    -0.07227211f)) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.02729416f : 
                        0.030535521f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.019458065f : 
                        0.025372634f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.01675317f : 
                        0.010901608f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        0.015621176f : 
                        0.016649175f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.016129471f : 
                        -0.0046278546f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.0055565755f : 
                        -0.008457585f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        0.004708014f : 
                        0.009809305f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -7.917691E-4f : 
                        0.010096902f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.028697856f : 
                        0.023583794f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.01793764f : 
                        0.032890137f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.01699168f : 
                        0.009015555f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.02338329f : 
                        0.019832257f)))));
    return pred;
  } // constant pool size = 178B, number of visited nodes = 29, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {9, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {11, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {12, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {12, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {3, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_12_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.0747399f : 
                        -0.054151047f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.052075133f : 
                        -0.034386188f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                    -0.0722721f : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                        -0.07238185f : 
                        -0.07227211f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[2])) ? 
                -0.07227211f : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.026041927f : 
                        -0.011651421f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.010668691f : 
                        -0.004479768f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.07482245f : 
                        -0.05002292f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.061829325f : 
                        -0.03274618f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.038576555f : 
                        -0.020088686f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.013118289f : 
                        -0.004925234f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.004005323f : 
                        0.009486953f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.012255641f : 
                        0.01666363f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.025821924f : 
                        0.028705217f) : 
                     (data[0 /* Zip Code */] <100009.5f ? 
                        0.03149808f : 
                        0.029042248f)))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {14, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {7, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {10, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_12_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100004.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.041276317f : 
                        -0.047425486f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.040417414f : 
                        -0.045180548f)) : 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.027788566f : 
                        -0.01913203f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.034772106f : 
                        -0.030165851f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0030943153f : 
                        0.011954226f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0011216783f : 
                        -0.0027806228f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.008885527f : 
                        -0.0056528123f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0117855845f : 
                        -0.015303554f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        1.3383127E-4f : 
                        0.0047611673f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.00512484f : 
                        0.0014513496f)) : 
                 (data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.017996255f : 
                        -0.0065075303f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.020959435f : 
                        -0.0024584762f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.078906715f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.07892214f : 
                        0.07906149f)) : 
                0.0789067f)));
    return pred;
  } // constant pool size = 170B, number of visited nodes = 27, static init size = 360B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {5, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_13 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_13_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_13_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_13_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_13_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.071543165f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.071542226f : 
                        -0.071533106f)) : 
                -0.07154316f) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.025764044f : 
                        0.02892474f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.018168628f : 
                        0.024455998f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.014552104f : 
                        0.020315373f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        0.013073064f : 
                        0.014416881f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0061323843f : 
                        -0.0031533279f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.014987805f : 
                        -0.0032273044f)) : 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.006127326f : 
                        0.0102377385f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.004236623f : 
                        0.0067200405f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.027765645f : 
                        0.016113926f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        0.02701971f : 
                        0.022819199f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.0141042145f : 
                        0.0077634016f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.018401477f : 
                        0.017116375f)))));
    return pred;
  } // constant pool size = 185B, number of visited nodes = 27, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {13, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {6, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_13_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.074754275f : 
                        -0.073780075f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.055615444f : 
                        -0.030883927f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.07154316f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.07166566f : 
                        -0.071554884f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.07154316f : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.018832445f : 
                        -0.0068279537f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0067977346f : 
                        0.0010129025f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.07470648f : 
                        -0.07376664f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.05001159f : 
                        -0.019972462f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.020934502f : 
                        -0.011501576f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.008272645f : 
                        -0.0014740278f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.003538925f : 
                        0.008625129f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.011015682f : 
                        0.015221316f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.02562148f : 
                        0.023341028f) : 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.022485815f : 
                        0.028147472f)))));
    return pred;
  } // constant pool size = 195B, number of visited nodes = 27, static init size = 510B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {10, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_13_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.042353265f : 
                        -0.03881529f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.039680917f : 
                        -0.033660848f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.025947077f : 
                        -0.019695872f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.033449706f : 
                        -0.02940607f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.0013451109f : 
                        0.005317236f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.006073095f : 
                        0.0023325451f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0076440894f : 
                        -0.0044648326f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0105216475f : 
                        -0.013943634f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.002084864f : 
                        0.0069559976f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.0065149344f : 
                        3.053724E-4f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.010914066f : 
                        -0.004138779f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -0.019358896f : 
                        -0.0018107115f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.07718936f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.077201925f : 
                        0.07732023f)) : 
                0.077189356f)));
    return pred;
  } // constant pool size = 185B, number of visited nodes = 27, static init size = 450B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {12, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {8, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_14 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_14_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_14_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_14_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_14_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.07091215f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.070911385f : 
                        -0.07090395f)) : 
                -0.07091214f) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.021978555f : 
                        0.024985468f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.015326942f : 
                        0.020427821f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        0.008323996f : 
                        0.013896409f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.020290734f : 
                        9.138599E-5f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.013302117f : 
                        -0.0020532368f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.0027101247f : 
                        -0.0053693904f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        0.0053402954f : 
                        0.0028133588f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.012178776f : 
                        0.006075386f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.025073053f : 
                        0.01433837f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        0.024464319f : 
                        0.020327793f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.012526996f : 
                        0.0066411947f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.0152132455f : 
                        0.016352225f)))));
    return pred;
  } // constant pool size = 170B, number of visited nodes = 27, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {12, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {9, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_14_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.07403013f : 
                        -0.073142275f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.05384749f : 
                        -0.028844431f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.07091214f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.07101772f : 
                        -0.070922256f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.07091214f : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.029452823f : 
                        -0.019904673f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.015687183f : 
                        -0.004640538f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.07347988f : 
                        -0.04576504f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.058722448f : 
                        -0.028229855f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.03476981f : 
                        -0.016859287f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.010521071f : 
                        -0.0035469127f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.0065017003f : 
                        0.010947424f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.008783809f : 
                        0.01293848f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.020467835f : 
                        0.023142058f) : 
                     (data[0 /* Zip Code */] <100009.5f ? 
                        0.025867037f : 
                        0.023413545f)))));
    return pred;
  } // constant pool size = 190B, number of visited nodes = 27, static init size = 480B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_14_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.03629503f : 
                        -0.040794052f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        -0.039002784f : 
                        -0.032468244f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.025098402f : 
                        -0.017566882f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.026591087f : 
                        -0.032127626f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.0074910275f : 
                        0.0098782815f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.0019246158f : 
                        0.002278567f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.006564315f : 
                        -0.0034222358f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.009406444f : 
                        -0.012754203f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        2.1932645E-5f : 
                        0.0053421087f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0019659416f : 
                        0.0040996554f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.0068531176f : 
                        6.989301E-4f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.009868847f : 
                        -0.013745995f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.07573512f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.075745784f : 
                        0.07584618f)) : 
                0.075735115f)));
    return pred;
  } // constant pool size = 175B, number of visited nodes = 27, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {5, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {7, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_15 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_15_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_15_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_15_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_15_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.07036518f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.070364565f : 
                        -0.07035846f)) : 
                -0.070365176f) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.01933308f : 
                        0.02242104f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.013521607f : 
                        0.018373203f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.012181273f : 
                        0.0065983585f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        0.010599266f : 
                        0.011623033f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.009333804f : 
                        0.0030219213f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.0017475801f : 
                        -0.004185833f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        0.0049970504f : 
                        0.0027817795f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.011182462f : 
                        0.0056088543f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.023103291f : 
                        0.0124963485f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        0.021987231f : 
                        0.018170444f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.011046332f : 
                        0.0056816908f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.013611052f : 
                        0.014684239f)))));
    return pred;
  } // constant pool size = 175B, number of visited nodes = 27, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {9, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_15_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.07339054f : 
                        -0.072576284f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.067794956f : 
                        -0.03820205f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.070365176f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.07045634f : 
                        -0.07037391f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.070365176f : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.015986307f : 
                        -0.004985815f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0051592276f : 
                        0.0019080618f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.07350634f : 
                        -0.07256387f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.046179626f : 
                        -0.01606211f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.02146627f : 
                        -0.009876811f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.007949694f : 
                        -0.0019672906f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.007063377f : 
                        0.0026277078f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.008924119f : 
                        0.01255095f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.02073933f : 
                        0.018429847f) : 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.017417843f : 
                        0.022994509f)))));
    return pred;
  } // constant pool size = 185B, number of visited nodes = 27, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_15_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100004.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.03468421f : 
                        -0.04128678f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.03373282f : 
                        -0.038898613f)) : 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.022888716f : 
                        -0.014317163f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.02439093f : 
                        -0.030267373f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        7.4539124E-4f : 
                        0.006528306f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0044536437f : 
                        0.003958224f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.0066115703f : 
                        -0.0031969876f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.00838579f : 
                        -0.0116110565f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        7.499863E-4f : 
                        0.005830436f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0044727456f : 
                        0.0016985438f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0059516197f : 
                        0.0014504343f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.008741326f : 
                        -0.012564368f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.07449817f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.07450726f : 
                        0.07459281f)) : 
                0.07449816f)));
    return pred;
  } // constant pool size = 165B, number of visited nodes = 27, static init size = 330B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {11, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_16 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_16_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_16_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_16_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_16_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06989053f : 
                        -0.06989052f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.06989001f : 
                        -0.06988498f)) : 
                -0.06989052f) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.024281265f : 
                        0.0048468504f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.01705645f : 
                        0.027191464f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.012013727f : 
                        0.016425729f) : 
                    0.00971265f))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.002789256f : 
                        -7.237751E-5f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.011369713f : 
                        3.0993257E-4f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        0.00461379f : 
                        0.0027242284f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.010263078f : 
                        0.0052332147f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.020863071f : 
                        0.011084072f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        0.019917836f : 
                        0.016125653f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.009829639f : 
                        0.0047705555f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.012074545f : 
                        0.013073257f)))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {9, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_16_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.07282648f : 
                        -0.07206588f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.050564967f : 
                        -0.024595058f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06989052f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06996937f : 
                        -0.06989808f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06989052f : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.026450027f : 
                        -0.016926799f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0133937355f : 
                        -0.0031654849f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.07241372f : 
                        -0.0416674f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.05590474f : 
                        -0.024139717f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.031136295f : 
                        -0.013884051f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.00973143f : 
                        -0.0041831927f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.004198534f : 
                        0.008398185f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.0062667583f : 
                        0.010056505f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.020420587f : 
                        0.014318207f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.016197288f : 
                        0.020788895f)))));
    return pred;
  } // constant pool size = 190B, number of visited nodes = 27, static init size = 480B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_16_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.036203295f : 
                        -0.032180626f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.03341781f : 
                        -0.027172761f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.023987971f : 
                        -0.018037565f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.02820395f : 
                        -0.023983244f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        0.0015046662f : 
                        0.006902066f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0034973668f : 
                        0.004644113f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0048077703f : 
                        -0.0017119689f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0074603013f : 
                        -0.010631723f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.0012664394f : 
                        0.0062872f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -6.116066E-4f : 
                        0.0051194653f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.005013199f : 
                        0.0021162801f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -0.011524479f : 
                        -0.007760936f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.07344201f : 
                        0.07344202f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.0734498f : 
                        0.073522955f)) : 
                0.07344201f)));
    return pred;
  } // constant pool size = 194B, number of visited nodes = 28, static init size = 480B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {12, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {9, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_17 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_17_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_17_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_17_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_17_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.069478184f : 
                        -0.06947572f) : 
                    -0.06947818f) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06947819f : 
                        -0.06947358f) : 
                    -0.06947818f)) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.02185493f : 
                        0.0039966376f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.015352854f : 
                        0.024939448f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.011368341f : 
                        0.016357861f) : 
                    0.008587709f))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.009852436f : 
                        7.803307E-4f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -3.838121E-5f : 
                        -0.0023539972f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        0.0016410757f : 
                        0.0072790687f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        0.006023919f : 
                        0.0023256936f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.016909806f : 
                        0.012964913f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0074973158f : 
                        0.0208093f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.009409317f : 
                        0.0026172746f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.014892054f : 
                        0.010116556f)))));
    return pred;
  } // constant pool size = 169B, number of visited nodes = 28, static init size = 330B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {10, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {12, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_17_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.0719413f : 
                        -0.044203617f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.06310556f : 
                        -0.029639808f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06947818f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06954648f : 
                        -0.069484726f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06947818f : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.013562539f : 
                        -0.0034551546f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0038467331f : 
                        0.002464195f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.07254917f : 
                        -0.07160266f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.04251681f : 
                        -0.0127003705f)) : 
                 (data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.018477147f : 
                        -0.007702251f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.0063394667f : 
                        -0.0010147365f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.0027204934f : 
                        0.007886597f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.0072023603f : 
                        0.010554932f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.01644543f : 
                        0.014373295f) : 
                     (data[0 /* Zip Code */] <100009.5f ? 
                        0.019390075f : 
                        0.016878538f)))));
    return pred;
  } // constant pool size = 190B, number of visited nodes = 27, static init size = 480B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {8, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_17_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.0301089f : 
                        -0.03486475f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.03146785f : 
                        -0.025443567f)) : 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.019909618f : 
                        -0.011817518f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.026088648f : 
                        -0.02145862f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.002145579f : 
                        0.0072535495f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.0029206537f : 
                        0.0049961596f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0052211545f : 
                        -0.0016492998f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.006619259f : 
                        -0.009709884f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.0042969906f : 
                        0.008475799f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -8.097849E-5f : 
                        0.0055826195f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.00699782f : 
                        -5.2609226E-5f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.014644313f : 
                        0.0018229531f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.07253728f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.07254395f : 
                        0.072606705f)) : 
                0.07253727f)));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_18 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_18_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_18_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_18_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_18_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06911966f : 
                        -0.069116734f) : 
                    -0.069119655f) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06911966f : 
                        -0.06911669f) : 
                    -0.069119655f)) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.020141058f : 
                        0.0028371592f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.01378313f : 
                        0.02254851f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.009267061f : 
                        0.013328937f) : 
                    0.0075908373f))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0012308877f : 
                        0.0012869519f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.014566189f : 
                        -2.7593397E-4f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        0.0040552267f : 
                        0.0024375843f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.008766449f : 
                        0.0044918265f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.015237303f : 
                        0.011320195f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0065138326f : 
                        0.018941242f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.008411201f : 
                        0.0021599366f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.013482197f : 
                        0.008942814f)))));
    return pred;
  } // constant pool size = 174B, number of visited nodes = 28, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_18_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.071500115f : 
                        -0.0425051f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.041718394f : 
                        -0.022938618f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                    -0.069119655f : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                        -0.069165304f : 
                        -0.069119655f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[2])) ? 
                -0.069119655f : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.012755103f : 
                        -0.0044027106f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0018350917f : 
                        0.00253556f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.072059855f : 
                        -0.0712017f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.051024973f : 
                        -0.003401655f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.030143164f : 
                        -0.01595464f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.006855324f : 
                        -0.0013699173f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.004159004f : 
                        0.00749446f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.0055175824f : 
                        0.008823138f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.014734055f : 
                        0.012712443f) : 
                     (data[0 /* Zip Code */] <100009.5f ? 
                        0.017484479f : 
                        0.015072751f)))));
    return pred;
  } // constant pool size = 175B, number of visited nodes = 27, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {14, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_18_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        -0.032103725f : 
                        -0.027789406f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.023582302f : 
                        -0.016538884f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.036090553f : 
                        -0.030828206f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                        -0.030370077f : 
                        -0.00878936f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        0.0026123947f : 
                        0.0072750426f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0019950261f : 
                        0.005522479f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0034199106f : 
                        -3.517712E-4f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0077660712f : 
                        -0.005386888f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.004689375f : 
                        0.008404565f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -6.0401903E-4f : 
                        0.0053690774f)) : 
                 (data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        -0.011561432f : 
                        -7.951609E-4f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        -0.01348691f : 
                        0.0020258948f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.07176005f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                        0.071765795f : 
                        0.07181976f)) : 
                0.07176005f)));
    return pred;
  } // constant pool size = 195B, number of visited nodes = 27, static init size = 510B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {8, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {11, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_19 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_19_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_19_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_19_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_19_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[2])) ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06880761f : 
                        -0.06880704f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.06880761f : 
                        -0.06880704f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06880768f : 
                        -0.06880444f) : 
                    -0.06880767f)) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.015751982f : 
                        0.008297867f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.012022065f : 
                        0.02295144f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        0.00896696f : 
                        0.01328125f) : 
                    0.0067199515f))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.008135019f : 
                        0.0020290236f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.0011619824f : 
                        -9.765145E-4f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        0.0038225194f : 
                        0.002331527f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.007970033f : 
                        0.004140738f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.013720443f : 
                        0.009965372f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0056563397f : 
                        0.017228022f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.0073374133f : 
                        0.0016292239f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.012025219f : 
                        0.007978141f)))));
    return pred;
  } // constant pool size = 188B, number of visited nodes = 29, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {10, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {4, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {12, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_19_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.07165556f : 
                        -0.0708552f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0643391f : 
                        -0.030689659f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06880767f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.068859145f : 
                        -0.06881251f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06880767f : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.022294803f : 
                        -0.012252498f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.01050766f : 
                        -0.0016407738f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.071209796f : 
                        -0.035695165f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.051837265f : 
                        -0.018792953f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.016216043f : 
                        -0.0068795052f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.0050646286f : 
                        -2.311732E-4f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.003740439f : 
                        0.0068385666f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.004955272f : 
                        0.007986018f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.0110260425f : 
                        0.013804855f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.016221512f : 
                        0.011669204f)))));
    return pred;
  } // constant pool size = 195B, number of visited nodes = 27, static init size = 510B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {14, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {3, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_19_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.017481085f : 
                        -0.025336575f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[2])) ? 
                        -0.028357109f : 
                        -0.014224761f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.03428559f : 
                        -0.029109698f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                        -0.028491372f : 
                        -0.00782317f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        0.0012257952f : 
                        0.012935774f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        0.0010971383f : 
                        0.0047737416f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0022069442f : 
                        0.0014000958f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0070526795f : 
                        -0.004730151f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        3.998476E-4f : 
                        0.009358165f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.0011067818f : 
                        0.00745663f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        -0.0033499785f : 
                        0.0036646833f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.00541502f : 
                        -0.008755269f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.07109075f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.07109562f : 
                        0.07114225f)) : 
                0.07109075f)));
    return pred;
  } // constant pool size = 190B, number of visited nodes = 27, static init size = 480B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {5, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {8, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {9, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_20 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_20_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_20_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_20_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_20_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.068535425f : 
                        -0.06853599f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                        -0.06853494f : 
                        -0.06853599f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06853599f : 
                        -0.06853389f) : 
                    -0.06853599f)) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0141615f : 
                        0.0072651207f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0107498355f : 
                        0.021271046f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.0071525495f : 
                        0.010826452f) : 
                    0.0059194416f))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -8.174694E-5f : 
                        0.0022472604f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.007894362f : 
                        0.0032424212f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        0.0035525546f : 
                        0.0022028955f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0072989403f : 
                        0.0038092588f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.01230582f : 
                        0.008820101f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0052171797f : 
                        0.015480768f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.006451922f : 
                        0.0012968921f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.010960903f : 
                        0.007058723f)))));
    return pred;
  } // constant pool size = 183B, number of visited nodes = 29, static init size = 390B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {12, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_20_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.07124992f : 
                        -0.07052595f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.04430571f : 
                        -0.017371172f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06853599f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06858074f : 
                        -0.0685402f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06853599f : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.010312785f : 
                        -0.0015116091f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0025526597f : 
                        0.0028449413f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.07139438f : 
                        -0.070509665f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.048006874f : 
                        -3.069652E-4f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.026446132f : 
                        -0.013553973f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0055035427f : 
                        -6.920258E-4f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.0015330663f : 
                        0.006616692f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.005309387f : 
                        0.007887945f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.014035913f : 
                        0.00788867f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.009596089f : 
                        0.014169495f)))));
    return pred;
  } // constant pool size = 190B, number of visited nodes = 27, static init size = 480B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {8, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_20_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        -0.028814418f : 
                        -0.024389317f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.020621385f : 
                        -0.014073875f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.032553177f : 
                        -0.027479725f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                        -0.02673512f : 
                        -0.0069456897f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        0.0032748473f : 
                        0.007282242f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        5.4026506E-4f : 
                        0.008651813f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0016793065f : 
                        0.001909695f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.004609356f : 
                        -0.0075902604f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.005180631f : 
                        0.008287686f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        1.2520453E-4f : 
                        0.0046030376f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -0.005030541f : 
                        0.0012912566f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        -0.011659531f : 
                        0.002863173f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.070513174f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.070517376f : 
                        0.07055765f)) : 
                0.07051317f)));
    return pred;
  } // constant pool size = 190B, number of visited nodes = 27, static init size = 480B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {8, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {11, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {8, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_21 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_21_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_21_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_21_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_21_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06829927f : 
                        -0.06829752f) : 
                    -0.06829926f) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                    -0.06829923f : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.06829833f : 
                        -0.06829926f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.015500455f : 
                        -1.1653593E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.009836565f : 
                        0.01749582f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.00695763f : 
                        0.010930205f) : 
                    0.005226769f))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0044933353f : 
                        0.006326604f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.0020032853f : 
                        3.2412307E-5f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0011188255f : 
                        0.0031857155f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0066728173f : 
                        0.003530807f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.011065727f : 
                        0.0077163163f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.004562167f : 
                        0.014149334f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.0056505143f : 
                        9.1607234E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.009778796f : 
                        0.0062842094f)))));
    return pred;
  } // constant pool size = 174B, number of visited nodes = 28, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_21_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.07088451f : 
                        -0.07022604f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0628138f : 
                        -0.027205631f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06829926f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06833819f : 
                        -0.06830293f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06829926f : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.020116031f : 
                        -0.0103382105f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.008946874f : 
                        -9.0615277E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.07102058f : 
                        -0.070212126f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.05529953f : 
                        -0.019543177f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.014061358f : 
                        -0.0053494414f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.006006637f : 
                        -6.3924544E-4f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.0030238784f : 
                        0.00535077f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.0040978217f : 
                        0.010134557f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.008558866f : 
                        0.011132981f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.013541173f : 
                        0.008976978f)))));
    return pred;
  } // constant pool size = 195B, number of visited nodes = 27, static init size = 510B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {14, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {7, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {10, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_21_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100002.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[2])) ? 
                        -0.031145165f : 
                        -0.013070741f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.01396667f : 
                        -0.009270527f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.038643084f : 
                        -0.023136199f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.014163468f : 
                        -0.020344185f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.003494188f : 
                        0.0071431505f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        0.0010542383f : 
                        0.008758541f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0012833872f : 
                        0.0023432877f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0059047285f : 
                        -0.003567289f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.004609536f : 
                        0.007344789f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        5.1555363E-4f : 
                        0.0056941584f)) : 
                 (data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.009346353f : 
                        6.1464065E-4f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -0.010735429f : 
                        0.0029013776f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.07001384f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.07001748f : 
                        0.07005232f)) : 
                0.070013836f)));
    return pred;
  } // constant pool size = 185B, number of visited nodes = 27, static init size = 450B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {3, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {4, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_22 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_22_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_22_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_22_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_22_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                -0.06809285f : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.0680929f : 
                        -0.06809093f) : 
                    -0.06809289f)) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.013962208f : 
                        -5.9679785E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0088540325f : 
                        0.016084377f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.0054577715f : 
                        0.008764734f) : 
                    0.004601576f))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.009149356f : 
                        0.0026309306f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.002995227f : 
                        4.7459148E-4f)) : 
                0.0031206724f) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.009979374f : 
                        0.0067365523f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0039935997f : 
                        0.012767938f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.004959885f : 
                        6.522959E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.008939161f : 
                        0.0055580046f)))));
    return pred;
  } // constant pool size = 144B, number of visited nodes = 23, static init size = 300B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_22_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.0705463f : 
                        -0.06995517f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.041276276f : 
                        -0.014484709f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06809289f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06812678f : 
                        -0.06809608f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06809289f : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.01877177f : 
                        -0.0093304245f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0056268f : 
                        5.361515E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.0703353f : 
                        -0.028006352f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.070681624f : 
                        0.0019738467f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.022894416f : 
                        -0.011428718f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.004404216f : 
                        -2.4014439E-4f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.0025929618f : 
                        0.0050100037f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.0048467526f : 
                        0.007469035f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.011770001f : 
                        0.005761634f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.007333681f : 
                        0.011766713f)))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_22_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        -0.025835361f : 
                        -0.0214013f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.018072326f : 
                        -0.011724592f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.02965611f : 
                        -0.024581285f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                        -0.023887368f : 
                        -0.0047040647f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        0.0036500902f : 
                        0.006972262f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -4.1071642E-5f : 
                        0.0066049835f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0028312118f : 
                        9.074692E-4f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.005390389f : 
                        -0.0031141113f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.0034894894f : 
                        0.010463035f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.001845279f : 
                        0.0073975483f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        -0.002229888f : 
                        0.0049410136f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.0037479294f : 
                        -0.0066599054f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.06958147f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.06958462f : 
                        0.06961481f)) : 
                0.06958147f)));
    return pred;
  } // constant pool size = 190B, number of visited nodes = 27, static init size = 480B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {8, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {11, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {10, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_23 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_23_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_23_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_23_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_23_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                    -0.067912854f : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.06791224f : 
                        -0.067912884f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.067912884f : 
                        -0.067911595f) : 
                    -0.067912884f)) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.012662766f : 
                        -7.36845E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.007898327f : 
                        0.014801999f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.004227203f : 
                        0.007007895f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.009618143f : 
                        -0.0075940685f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        0.0010511823f : 
                        0.0030797452f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0066256085f : 
                        0.004580412f)) : 
                0.0029006337f) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.009502182f : 
                        0.0064934567f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.003497506f : 
                        0.011620333f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.001106045f : 
                        0.0036774776f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.008007196f : 
                        0.0049567097f)))));
    return pred;
  } // constant pool size = 166B, number of visited nodes = 26, static init size = 360B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_23_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.07004198f : 
                        -0.032982312f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.05728968f : 
                        -0.01954579f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.067912884f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0679424f : 
                        -0.06791566f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.067912884f : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.013046651f : 
                        -0.0038547402f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0015406971f : 
                        0.002963988f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.07037343f : 
                        -0.069693334f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.053020876f : 
                        -0.016908165f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        -0.012141005f : 
                        -0.0032225412f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.0043214895f : 
                        -0.0011763797f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.003955342f : 
                        -3.4213805E-4f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.0038860862f : 
                        0.0059874505f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.010540317f : 
                        0.00496396f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.0064792167f : 
                        0.010632666f)))));
    return pred;
  } // constant pool size = 185B, number of visited nodes = 27, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {14, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_23_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100002.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[2])) ? 
                        -0.028136047f : 
                        -0.0110533815f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.011594603f : 
                        -0.007004343f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.03604481f : 
                        -0.020430868f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.011742764f : 
                        -0.017755812f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.003751416f : 
                        0.006774249f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        0.0017147225f : 
                        0.008754882f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -6.531251E-4f : 
                        0.0031017181f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0031718959f : 
                        -0.0059556006f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.004857875f : 
                        0.0070063896f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        7.755835E-4f : 
                        0.004887069f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.003614187f : 
                        0.002252117f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.009328636f : 
                        0.003344374f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.06920657f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.069209315f : 
                        0.069235496f)) : 
                0.06920657f)));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {3, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {4, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {9, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_24 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_24_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_24_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_24_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_24_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06775581f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.067755684f : 
                        -0.06775438f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                    -0.06775581f : 
                    -0.0677558f)) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.009570921f : 
                        0.00390436f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0069194008f : 
                        0.015231203f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.0042588464f : 
                        0.0071532135f) : 
                    0.0035095923f))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0055284095f : 
                        0.0037997586f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.002765876f : 
                        0.0010248711f)) : 
                0.002653452f) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.008079294f : 
                        0.0051776073f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0030715752f : 
                        0.010487566f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.0039816624f : 
                        -6.176592E-5f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.0072684097f : 
                        0.0043764035f)))));
    return pred;
  } // constant pool size = 153B, number of visited nodes = 24, static init size = 330B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {10, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {12, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_24_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.0700859f : 
                        -0.06948221f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.06038183f : 
                        -0.022498794f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.0677558f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.067781545f : 
                        -0.06775823f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.0677558f : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.017258994f : 
                        -0.007797115f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0046110544f : 
                        8.7068026E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06987376f : 
                        -0.02499551f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.07009132f : 
                        0.0037203783f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.019624582f : 
                        -0.0095634395f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0035733946f : 
                        1.7069973E-4f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.002003858f : 
                        0.0039397106f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.0036808155f : 
                        0.010032443f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.0058084023f : 
                        0.008328651f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.010604672f : 
                        0.0057822485f)))));
    return pred;
  } // constant pool size = 185B, number of visited nodes = 27, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {10, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_24_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.023671785f : 
                        -0.018002149f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.020402063f : 
                        -0.014008935f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.01120432f : 
                        -0.00566184f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.017354902f : 
                        -0.013151328f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.004283971f : 
                        -0.003321662f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.010910438f : 
                        0.004527707f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -7.915383E-4f : 
                        0.0022116746f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0045163697f : 
                        -0.002276445f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100001.5f ? 
                        0.0069841873f : 
                        0.0047952337f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        9.561411E-4f : 
                        0.005979003f)) : 
                 (data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.0076193344f : 
                        0.0015530788f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.008522677f : 
                        0.0031309044f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.06888113f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.06888351f : 
                        0.06890625f)) : 
                0.068881124f)));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {12, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {9, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_25 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_25_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_25_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_25_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_25_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.0676187f : 
                        -0.06761804f) : 
                    -0.0676187f) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.0676187f : 
                        -0.067617476f) : 
                    -0.0676187f)) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0107934745f : 
                        -0.0018720789f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.006362995f : 
                        0.0123310825f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.0032139132f : 
                        0.00580631f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.008002585f : 
                        -0.0072974875f)))) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.007854973f : 
                        0.003230181f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.0034827143f : 
                        0.0012551429f)) : 
                0.0024682067f) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0072375736f : 
                        0.0045842505f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0029534418f : 
                        0.0095152045f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.0017715105f : 
                        0.002905994f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.0064763348f : 
                        0.0039035035f)))));
    return pred;
  } // constant pool size = 156B, number of visited nodes = 26, static init size = 300B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {10, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_25_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06960295f : 
                        -0.029428797f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.055038072f : 
                        -0.016975043f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.0676187f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06764114f : 
                        -0.06762081f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.0676187f : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.011386552f : 
                        -0.003015725f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.00104959f : 
                        0.0028699322f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.069514796f : 
                        -0.070959374f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.06948395f : 
                        -0.014639878f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.018295644f : 
                        -0.008729883f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.0039331983f : 
                        -7.1696186E-4f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        5.1448756E-4f : 
                        0.0030787988f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.0019192322f : 
                        0.004292915f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.006978079f : 
                        0.005163189f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.007163692f : 
                        0.010964371f)))));
    return pred;
  } // constant pool size = 190B, number of visited nodes = 27, static init size = 480B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {14, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {3, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_25_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.02208284f : 
                        -0.017047912f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.015054344f : 
                        -0.008808766f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.025941761f : 
                        -0.020799885f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                        -0.02045151f : 
                        -0.0016572364f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0058027767f : 
                        4.3218562E-4f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0090766745f : 
                        0.0067624995f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -5.002325E-4f : 
                        0.0022881806f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0041194414f : 
                        -0.0019633675f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.0031522003f : 
                        0.009902359f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.0010530243f : 
                        0.0056156046f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        -0.005332316f : 
                        0.0020641699f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.002558015f : 
                        -0.005058591f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.068598315f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.06860038f : 
                        0.068620145f)) : 
                0.068598315f)));
    return pred;
  } // constant pool size = 190B, number of visited nodes = 27, static init size = 480B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {8, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {10, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {5, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {11, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_26 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_26_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_26_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_26_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_26_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                -0.06749895f : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.067498975f : 
                        -0.06749792f) : 
                    -0.067498975f)) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.0060522454f : 
                        0.007734783f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.0033596302f : 
                        0.0058640395f)) : 
                0.0026489436f)) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.007096177f : 
                        0.0032781307f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        0.00152164f : 
                        0.0039860327f)) : 
                0.0022914258f) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0065258117f : 
                        0.0040584146f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0027816498f : 
                        0.008566586f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.0031444014f : 
                        -6.010188E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.0057708374f : 
                        0.0034617789f)))));
    return pred;
  } // constant pool size = 141B, number of visited nodes = 21, static init size = 330B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_26_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06970595f : 
                        -0.0690843f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.03531561f : 
                        -0.009269592f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.067498975f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.067518555f : 
                        -0.067500815f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.067498975f : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.015913943f : 
                        -0.0064140647f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.006008061f : 
                        1.6625602E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.06947892f : 
                        -0.021506902f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.02371069f : 
                        -0.008540486f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        -0.009788773f : 
                        -0.0021397967f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0013033465f : 
                        6.2754104E-4f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0031799707f : 
                        -8.028871E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.0029615494f : 
                        0.005384276f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.008195095f : 
                        0.002750589f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.0041592936f : 
                        0.008166461f)))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {12, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_26_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100002.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[2])) ? 
                        -0.024342338f : 
                        -0.008619252f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.008540995f : 
                        -0.0040880395f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.032836813f : 
                        -0.016799929f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.008692941f : 
                        -0.014407584f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0042306813f : 
                        -0.0028032558f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.009795363f : 
                        0.0045132097f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -8.2660693E-4f : 
                        0.0015267653f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0021087918f : 
                        -0.0047401167f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100001.5f ? 
                        0.006569931f : 
                        0.0047738603f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        9.668789E-4f : 
                        0.004720766f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0014137094f : 
                        0.005737779f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.00225155f : 
                        -0.004586672f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.06835233f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.06835412f : 
                        0.068371326f)) : 
                0.06835232f)));
    return pred;
  } // constant pool size = 165B, number of visited nodes = 27, static init size = 330B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {3, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {4, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_27 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_27_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_27_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_27_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_27_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.067394406f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06739432f : 
                        -0.0673935f)) : 
                -0.0673944f) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.0048365397f : 
                        0.006711714f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.0029285492f : 
                        0.0052776234f)) : 
                0.0023193248f)) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
            0.0020466538f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.011209237f : 
                        0.0029091192f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0011654508f : 
                        0.007527896f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.0022146916f : 
                        0.0023573155f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.005247712f : 
                        0.0030499217f)))));
    return pred;
  } // constant pool size = 110B, number of visited nodes = 17, static init size = 240B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {9, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_27_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06948438f : 
                        -0.068907686f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.058035627f : 
                        -0.01826866f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.0673944f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0674115f : 
                        -0.06739601f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.0673944f : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.014913241f : 
                        -0.0057769627f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0035269705f : 
                        0.0011533801f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.069274165f : 
                        -0.0211458f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.06952446f : 
                        0.0070234514f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.012985021f : 
                        -0.0051963753f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.0024671524f : 
                        1.3174718E-4f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.0010846867f : 
                        0.0026200577f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -0.0030146092f : 
                        0.007218475f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.007448788f : 
                        0.0024104612f) : 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.0036914726f : 
                        0.0074327774f)))));
    return pred;
  } // constant pool size = 185B, number of visited nodes = 27, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {3, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_27_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.020008313f : 
                        -0.014045755f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.01685394f : 
                        -0.0104938755f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.008697526f : 
                        -0.003675582f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.014349234f : 
                        -0.010224505f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0055191265f : 
                        6.306383E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0049124705f : 
                        0.009335414f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -6.5655855E-4f : 
                        0.0016922543f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0034797804f : 
                        -0.001378924f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.0050133644f : 
                        0.006875743f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.001084691f : 
                        0.0045411563f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.0012201985f : 
                        0.005607023f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.0019445384f : 
                        -0.0042022015f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.0681382f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.06813977f : 
                        0.068154745f)) : 
                0.0681382f)));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {8, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_28 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_28_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_28_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_28_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_28_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06730305f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06730297f : 
                        -0.06730226f)) : 
                -0.06730304f) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.0042122267f : 
                        0.0061375005f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.0029903355f : 
                        0.005574013f)) : 
                0.002027498f)) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
            0.0019802041f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.00583324f : 
                        0.003323994f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0024772445f : 
                        0.0072530163f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.0025862162f : 
                        -9.3008025E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.004749119f : 
                        0.0026791634f)))));
    return pred;
  } // constant pool size = 110B, number of visited nodes = 17, static init size = 240B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_28_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06909949f : 
                        -0.024116717f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.028376048f : 
                        -0.010649526f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06730304f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06731796f : 
                        -0.06730445f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06730304f : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.005554621f : 
                        8.9942565E-4f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -5.7345664E-4f : 
                        0.0028448633f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.069314584f : 
                        -0.06873355f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.026367873f : 
                        -0.0013013025f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        -0.008305083f : 
                        -0.0016915593f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -8.216466E-4f : 
                        7.186952E-4f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        9.7627356E-4f : 
                        0.0023745012f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -0.0029332316f : 
                        0.006649599f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.0033275266f : 
                        0.0051959525f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.005222801f : 
                        0.009167822f)))));
    return pred;
  } // constant pool size = 190B, number of visited nodes = 27, static init size = 480B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_28_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.018576391f : 
                        -0.01354687f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.01257631f : 
                        -0.0064834715f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.022771753f : 
                        -0.017536199f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                        -0.017554881f : 
                        8.0460164E-4f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0040827193f : 
                        -0.0024708423f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.008682252f : 
                        0.004400635f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -4.825022E-4f : 
                        0.0017999393f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0016169357f : 
                        -0.0040763533f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.0044772206f : 
                        0.0061231977f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.0011597552f : 
                        0.004363678f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -0.002210381f : 
                        0.0032292167f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        -0.006605607f : 
                        0.0039974777f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        0.06795168f : 
                        0.06795169f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                        0.06795305f : 
                        0.067966096f)) : 
                0.06795168f)));
    return pred;
  } // constant pool size = 199B, number of visited nodes = 28, static init size = 510B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {8, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {9, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {5, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {9, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {5, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_29 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_29_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_29_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_29_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_29_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.067223206f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.067223154f : 
                        -0.067222536f)) : 
                -0.067223206f) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        0.0043408517f : 
                        0.005832854f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.0022013453f : 
                        0.004362308f)) : 
                0.0017818813f)) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
            0.0019069309f : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.00618769f : 
                        -0.00778577f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.003976952f : 
                        0.007490314f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.0024625743f : 
                        0.0019096327f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.004334078f : 
                        0.0023555064f)))));
    return pred;
  } // constant pool size = 110B, number of visited nodes = 17, static init size = 240B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_29_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06920922f : 
                        -0.068594694f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.031398665f : 
                        -0.005414006f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.067223206f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.067236245f : 
                        -0.067224436f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.067223206f : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.013567514f : 
                        -0.0048308936f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.004885077f : 
                        4.5640866E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.068815075f : 
                        -0.070276506f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.06879919f : 
                        -0.009651348f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.013924353f : 
                        -0.006117712f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0021347126f : 
                        8.3494704E-4f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        8.656586E-4f : 
                        0.00216519f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.0029063683f : 
                        0.0060937926f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.0029055872f : 
                        0.0046597356f) : 
                     (data[0 /* Zip Code */] <100009.5f ? 
                        0.0069212243f : 
                        0.004032197f)))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_29_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100002.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100001.5f ? 
                        -0.015870217f : 
                        -0.00826306f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0059464364f : 
                        -0.0018765164f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.030093253f : 
                        -0.013717244f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.006202004f : 
                        -0.011638199f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.005158754f : 
                        7.010955E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0042871414f : 
                        0.0090591f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -3.4309112E-4f : 
                        0.0018561563f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0029607937f : 
                        -9.4882026E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -6.8883237E-4f : 
                        0.005988604f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0040743873f : 
                        0.0061957077f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.002432368f : 
                        -0.010376146f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -6.4420624E-4f : 
                        -0.0032029678f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.06778912f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.06779031f : 
                        0.067801684f)) : 
                0.067789115f)));
    return pred;
  } // constant pool size = 175B, number of visited nodes = 27, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {3, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {5, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {3, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_30 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_30_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_30_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_30_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_30_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.06715341f : 
                        -0.06715343f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.06715321f : 
                        -0.06715343f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06715343f : 
                        -0.067152984f) : 
                    -0.06715343f)) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        0.0031259446f : 
                        0.005116549f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        0.002269077f : 
                        0.0048170844f)) : 
                0.0015521933f)) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
            0.0018185563f : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.006254559f : 
                        -0.013331982f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.004122993f : 
                        0.00980335f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.001124241f : 
                        0.002156827f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.0076372707f : 
                        0.0019133117f)))));
    return pred;
  } // constant pool size = 127B, number of visited nodes = 20, static init size = 270B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {3, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_30_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06880959f : 
                        -0.02107659f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.02627044f : 
                        -0.007850456f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06715343f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06716482f : 
                        -0.067154504f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06715343f : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.0047498387f : 
                        0.0011f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -4.0091074E-4f : 
                        0.002655414f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.068950824f : 
                        -0.068449415f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.024066174f : 
                        -2.3125821E-4f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.004673929f : 
                        0.0010814946f) : 
                    -1.764067E-4f)) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        7.629178E-4f : 
                        0.0019133862f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        -0.0027914017f : 
                        0.0055835936f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        0.004218756f : 
                        0.0025646482f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.0041230596f : 
                        0.007872621f)))));
    return pred;
  } // constant pool size = 181B, number of visited nodes = 26, static init size = 450B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_30_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.016896527f : 
                        -0.010679574f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.014057169f : 
                        -0.0076840464f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0066345464f : 
                        -0.0021270858f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.011853642f : 
                        -0.007825169f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0038784745f : 
                        -0.002060915f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.007908067f : 
                        0.004077206f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0011653417f : 
                        0.0017989767f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0036744098f : 
                        0.0024205702f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -5.3470884E-4f : 
                        0.0057341927f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.0037842675f : 
                        0.005887296f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0021762813f : 
                        -0.009672912f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -4.8124653E-4f : 
                        -0.0029389898f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.06764736f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.067648396f : 
                        0.06765832f)) : 
                0.06764736f)));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {12, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {9, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {9, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {4, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {3, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_31 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_31_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_31_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_31_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_31_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06709244f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.0670924f : 
                        -0.067091934f)) : 
                -0.06709244f) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.003312988f : 
                        -0.0014514243f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.003350321f : 
                        0.0070242677f)) : 
                0.0013485949f)) : 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[2])) ? 
            0.0017423696f : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0055777873f : 
                        -0.0122118415f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0037884617f : 
                        0.009186652f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.0014868798f : 
                        0.0019483486f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.007042878f : 
                        0.0016715035f)))));
    return pred;
  } // constant pool size = 105B, number of visited nodes = 17, static init size = 210B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {3, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_31_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06897747f : 
                        -0.06832914f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.028873168f : 
                        -0.0032019995f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06709244f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06710239f : 
                        -0.06709337f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06709244f : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.012453826f : 
                        -0.003955627f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.004270783f : 
                        5.7124306E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.068324015f : 
                        -0.069384836f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.06878666f : 
                        0.02643807f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.025107857f : 
                        -0.0042950255f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0016936177f : 
                        8.901587E-4f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.0012015132f : 
                        0.003541267f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.005225698f : 
                        -0.002995208f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                        0.0014177626f : 
                        0.004821137f) : 
                     (data[0 /* Zip Code */] <100009.5f ? 
                        0.009602703f : 
                        0.0014510757f)))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_31_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        -0.015473436f : 
                        -0.010784022f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.010466166f : 
                        -0.004623545f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.02003442f : 
                        -0.014704148f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                        -0.014900441f : 
                        0.0027388942f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.005452186f : 
                        -0.001121651f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0018731937f : 
                        0.0054634763f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0020596213f : 
                        0.0032834464f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.012913935f : 
                        0.007187788f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100001.5f ? 
                        0.005710101f : 
                        0.004067455f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.0010911985f : 
                        0.0050328816f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0019391438f : 
                        -0.009033207f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -4.0607408E-4f : 
                        -0.0026642934f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.06752369f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.06752459f : 
                        0.06753325f)) : 
                0.06752368f)));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {8, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {10, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_32 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_32_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_32_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_32_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_32_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06703912f : 
                        -0.06703888f) : 
                    -0.06703911f) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06703912f : 
                        -0.06703867f) : 
                    -0.06703911f)) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0068571046f : 
                        -0.0052076667f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0028253477f : 
                        0.0077138934f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        9.2185906E-4f : 
                        0.0038149564f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.005053766f : 
                        -0.008917433f)))) : 
        0.0018923281f);
    return pred;
  } // constant pool size = 83B, number of visited nodes = 14, static init size = 150B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {10, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_32_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06856502f : 
                        -0.018206647f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.02430403f : 
                        -0.005328396f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06703911f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06704781f : 
                        -0.06703993f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06703911f : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.0074371994f : 
                        -1.8618132E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.005406702f : 
                        5.580696E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06842585f : 
                        -0.0698109f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.041681994f : 
                        -0.0016699461f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.00731268f : 
                        -0.002450985f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0027727468f : 
                        9.910635E-4f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.001033948f : 
                        0.0032403986f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.0048130057f : 
                        -0.0028370735f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                        0.001285423f : 
                        0.0043123025f) : 
                     (data[0 /* Zip Code */] <100009.5f ? 
                        0.008747436f : 
                        0.001105383f)))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {6, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {14, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {7, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_32_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100002.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[2])) ? 
                        -0.018465571f : 
                        -0.004801801f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0042443094f : 
                        3.910441E-5f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.02754468f : 
                        -0.011273183f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.004237747f : 
                        -0.0093569225f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0045395615f : 
                        7.5024355E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0036260276f : 
                        0.008622626f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        8.036076E-5f : 
                        0.0016053607f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.002375762f : 
                        -4.5637175E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.009229993f : 
                        -0.003991725f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.004836766f : 
                        0.0067640096f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -9.1433316E-4f : 
                        -0.00874095f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.005524173f : 
                        -0.0022100543f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.067415744f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.067416534f : 
                        0.067424096f)) : 
                0.067415744f)));
    return pred;
  } // constant pool size = 175B, number of visited nodes = 27, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {3, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {3, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_33 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_33_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_33_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_33_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_33_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.066992484f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.066992454f : 
                        -0.066992104f)) : 
                -0.066992484f) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.002664145f : 
                        1.873896E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.0029011958f : 
                        0.008631291f)) : 
                9.774329E-4f)) : 
        0.001749137f);
    return pred;
  } // constant pool size = 58B, number of visited nodes = 9, static init size = 120B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_33_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06876397f : 
                        -0.06810615f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.054053504f : 
                        -0.010654537f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.066992484f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06700008f : 
                        -0.0669932f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.066992484f : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.0067376858f : 
                        -3.02568E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.0049971617f : 
                        5.635884E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.06854957f : 
                        -0.06812916f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.02083981f : 
                        6.33344E-4f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        -0.005857213f : 
                        -7.777325E-4f) : 
                    2.0084143E-4f)) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                    0.0011565393f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.0030385589f : 
                        0.0048386822f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100004.5f ? 
                        0.0036307597f : 
                        0.0015427291f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.005421578f : 
                        9.273891E-4f)))));
    return pred;
  } // constant pool size = 172B, number of visited nodes = 25, static init size = 420B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_33_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.009191306f : 
                        -0.014944522f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.011528594f : 
                        -0.0052418574f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.005807443f : 
                        -0.0020677305f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.009800846f : 
                        -0.005844582f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.004932632f : 
                        -0.001024082f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0015750637f : 
                        0.005008651f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0017599631f : 
                        0.0031863544f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.01188199f : 
                        0.006967228f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.00898704f : 
                        -0.00382232f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.004630504f : 
                        0.0063919993f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -8.2014705E-4f : 
                        -0.008034319f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.005209011f : 
                        -0.0020087075f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        0.06732151f : 
                        0.06732151f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.067322195f : 
                        0.067328796f)) : 
                0.0673215f)));
    return pred;
  } // constant pool size = 184B, number of visited nodes = 28, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {3, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {10, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {3, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_34 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_34_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_34_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_34_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_34_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[2])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.06695164f : 
                        -0.06695171f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                        -0.06695164f : 
                        -0.06695171f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.066951714f : 
                        -0.06695138f) : 
                    -0.06695171f)) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.0046246555f : 
                        8.195988E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.0025543382f : 
                        0.0057324804f)) : 
                8.332066E-4f)) : 
        0.0016218579f);
    return pred;
  } // constant pool size = 75B, number of visited nodes = 12, static init size = 150B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {10, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_34_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (data[0 /* Zip Code */] <100005.5f ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.068619f : 
                        -0.068007015f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.025418524f : 
                        -6.0046266E-4f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06695171f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06695835f : 
                        -0.06695233f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                -0.06695171f : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.0039264276f : 
                        -4.7547143E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.0051934393f : 
                        0.0011880846f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.068451114f : 
                        -0.012650132f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.06842029f : 
                        0.008615428f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                        -0.008027754f : 
                        -0.0029690468f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0011486307f : 
                        9.883263E-4f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        7.265884E-4f : 
                        0.0027982346f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.0041811024f : 
                        -0.0029332936f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0010602488f : 
                        0.0037306559f) : 
                     (data[0 /* Zip Code */] <100009.5f ? 
                        0.004447489f : 
                        0.0020979065f)))));
    return pred;
  } // constant pool size = 165B, number of visited nodes = 27, static init size = 330B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {7, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_34_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.013453002f : 
                        -0.006862178f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.010715799f : 
                        -0.004814845f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0053532035f : 
                        -0.0018392495f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.010273341f : 
                        -0.0063067623f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0030121466f : 
                        -0.0019928124f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0067946366f : 
                        0.0034586447f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -7.491279E-4f : 
                        0.0016748059f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0030394678f : 
                        0.0033785258f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.008337654f : 
                        -0.0035185954f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.004382634f : 
                        0.006009697f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -7.015617E-4f : 
                        -0.007486636f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.0049083275f : 
                        -0.0018040512f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.0672392f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        0.067239806f : 
                        0.06724557f)) : 
                0.0672392f)));
    return pred;
  } // constant pool size = 170B, number of visited nodes = 27, static init size = 360B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {3, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {9, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {3, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_35 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_35_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_35_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_35_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_35_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06691605f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.066916026f : 
                        -0.06691576f)) : 
                -0.06691605f) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.0021643853f : 
                        -5.155449E-5f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.0025578856f : 
                        0.007277074f)) : 
                7.0621906E-4f)) : 
        0.0015037359f);
    return pred;
  } // constant pool size = 58B, number of visited nodes = 9, static init size = 120B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_35_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06828967f : 
                        -0.013781924f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.021384656f : 
                        -0.002327128f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.0057235057f : 
                        -2.3739888E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.0041384315f : 
                        5.2715035E-4f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06691605f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.06692186f : 
                        -0.0669166f)) : 
                -0.06691605f)) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.068127215f : 
                        -0.0694798f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.068087734f : 
                        -0.004854232f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0059690704f : 
                        -0.0032250176f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0014460471f : 
                        4.4788013E-4f))) : 
            0.0015790428f));
    return pred;
  } // constant pool size = 132B, number of visited nodes = 20, static init size = 300B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {14, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {12, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_35_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.012456894f : 
                        -0.007604162f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.008298409f : 
                        -0.0027428695f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.016979445f : 
                        -0.011691559f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                        -0.012402435f : 
                        0.00452929f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.0042455643f : 
                        -9.547017E-4f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.001082533f : 
                        0.004534582f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0015636593f : 
                        0.0041565564f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.009257285f : 
                        7.54067E-4f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.007884103f : 
                        -0.0032216157f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0041659456f : 
                        0.0055818777f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -6.1849906E-4f : 
                        -0.0069798054f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.006751486f : 
                        -7.1633444E-4f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.067167304f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.06716783f : 
                        0.06717287f)) : 
                0.067167304f)));
    return pred;
  } // constant pool size = 185B, number of visited nodes = 27, static init size = 450B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {8, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {3, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_36 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_36_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_36_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_36_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_36_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06688486f : 
                        -0.06688486f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.06688484f : 
                        -0.06688461f)) : 
                -0.06688486f) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0053962907f : 
                        -0.006718641f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0019496476f : 
                        0.0063223406f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        3.757199E-4f : 
                        0.0028709157f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        0.003940596f : 
                        -0.008758669f)))) : 
        0.001394157f);
    return pred;
  } // constant pool size = 84B, number of visited nodes = 13, static init size = 180B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_36_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06845262f : 
                        -0.06782882f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.051921807f : 
                        -0.007851547f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.0032376107f : 
                        -4.7456165E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -5.9715554E-4f : 
                        0.0030554116f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06688486f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.06688994f : 
                        -0.06688534f)) : 
                -0.06688486f)) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.0681901f : 
                        -0.067850545f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.039824773f : 
                        -0.0057080043f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0029818679f : 
                        0.0013259151f) : 
                    4.7005116E-4f)) : 
            0.001421458f));
    return pred;
  } // constant pool size = 128B, number of visited nodes = 19, static init size = 300B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_36_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100002.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100001.5f ? 
                        -0.011411396f : 
                        -0.003848719f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.0026779734f : 
                        0.0017879991f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.024932742f : 
                        -0.008632799f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.0022190495f : 
                        -0.0069283987f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.003925008f : 
                        -8.431374E-4f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        9.923754E-4f : 
                        0.004228907f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.0013618224f : 
                        0.0030937695f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.010726814f : 
                        0.006880778f)))) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0074415547f : 
                        -0.0029801284f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.003901381f : 
                        0.0053081107f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -5.1921146E-4f : 
                        -0.006504555f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.004453545f : 
                        -0.0015140122f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    0.06710448f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.06710494f : 
                        0.06710935f)) : 
                0.06710448f)));
    return pred;
  } // constant pool size = 165B, number of visited nodes = 27, static init size = 330B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {3, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {10, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {13, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {3, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_37 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_37_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_37_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_37_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_37_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06685758f : 
                        -0.06685741f) : 
                    -0.06685758f) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                    -0.06685757f : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.06685749f : 
                        -0.06685758f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.0036754273f : 
                        4.2815343E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.001989755f : 
                        0.004597779f)) : 
                4.8450383E-4f)) : 
        0.0012870565f);
    return pred;
  } // constant pool size = 71B, number of visited nodes = 11, static init size = 150B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {9, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_37_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06812424f : 
                        -0.011288931f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.04466153f : 
                        -0.0044357697f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.0029286225f : 
                        -4.921645E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.004338856f : 
                        0.001075875f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06685758f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.06686202f : 
                        -0.06685799f)) : 
                -0.06685758f)) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.068231866f : 
                        -0.009836704f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.06808675f : 
                        0.008977061f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.005190109f : 
                        -0.0013678501f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -9.7168813E-4f : 
                        0.0017978877f))) : 
            0.001285947f));
    return pred;
  } // constant pool size = 132B, number of visited nodes = 20, static init size = 300B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {3, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_37_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.008798248f : 
                        -0.020924885f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0069228695f : 
                        0.0012726326f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.005527676f : 
                        -0.001610179f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.007600877f : 
                        -0.0038142041f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.002387191f : 
                        -0.001949298f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.005921847f : 
                        0.0028126964f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        9.837475E-4f : 
                        -0.0025803717f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.011790387f : 
                        -0.0011299925f)))) : 
         (data[0 /* Zip Code */] <100004.5f ? 
             (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                        0.06704958f : 
                        0.00712222f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                        -0.0029016102f : 
                        0.067050956f)) : 
                 (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.06704958f : 
                        0.06705255f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0028719462f : 
                        0.0044808723f))) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        3.065008E-6f : 
                        -0.0043121874f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.0042110006f : 
                        -0.0013814467f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.06704998f : 
                        0.06705383f) : 
                    0.06704958f))));
    return pred;
  } // constant pool size = 192B, number of visited nodes = 30, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {12, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {3, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_38 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_38_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_38_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_38_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_38_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06683371f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06683369f : 
                        -0.06683352f)) : 
                -0.06683371f) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.0034672238f : 
                        3.4942175E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        0.0018266223f : 
                        0.0041867034f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.009647045f : 
                        0.0038086001f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        0.003296447f : 
                        -6.846835E-4f)))) : 
        0.0011945834f);
    return pred;
  } // constant pool size = 75B, number of visited nodes = 12, static init size = 150B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {9, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_38_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100005.5f ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[2])) ? 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[1])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.006554175f : 
                        -0.011929544f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.0074646724f : 
                        -0.0024291633f)) : 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.013926179f : 
                        -0.0024426768f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0048818523f : 
                        0.0025182944f))) : 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[3])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                    -0.06683371f : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.066837594f : 
                        -0.06683408f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -8.507356E-4f : 
                        0.00267314f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.011702761f : 
                        0.0018076794f)))) : 
         (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[3])) ? 
             (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.0045028282f : 
                        -2.794529E-4f) : 
                    -0.06683371f) : 
                 (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                    -0.06683371f : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.0033268041f : 
                        5.097081E-4f))) : 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        -0.0069719483f : 
                        -6.328913E-4f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[2])) ? 
                        -9.937176E-4f : 
                        0.0016240944f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                        0.001590406f : 
                        0.010165039f) : 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        -0.0014671729f : 
                        0.0017515386f)))));
    return pred;
  } // constant pool size = 199B, number of visited nodes = 28, static init size = 510B
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {4, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {10, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {3, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {14, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {6, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {8, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_38_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.0058888188f : 
                        -0.011368716f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.008447026f : 
                        -0.0023069887f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0037801177f : 
                        -6.14221E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.008291151f : 
                        -0.0043347734f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0022133389f : 
                        -0.0017350279f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.005495874f : 
                        0.002603807f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        9.6168026E-4f : 
                        -0.0023534f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.0110033145f : 
                        -0.0010135864f)))) : 
         (data[0 /* Zip Code */] <100004.5f ? 
             (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                        0.06700159f : 
                        0.0068466947f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                        -0.0026708823f : 
                        0.067002796f)) : 
                 (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.06700159f : 
                        0.06700419f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0035248473f : 
                        0.0046737413f))) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.0048138318f : 
                        -4.0644838E-4f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.0057201893f : 
                        -4.9912086E-4f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.067001946f : 
                        0.06700531f) : 
                    0.06700159f))));
    return pred;
  } // constant pool size = 192B, number of visited nodes = 30, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {3, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {3, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {14, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_39 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_39_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_39_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_39_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_39_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.06681282f : 
                        -0.06681282f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.066812806f : 
                        -0.06681265f)) : 
                -0.06681283f) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0021568143f : 
                        5.3050497E-4f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0071978783f : 
                        0.002211548f)) : 
                5.821338E-4f)) : 
        0.0010728834f);
    return pred;
  } // constant pool size = 62B, number of visited nodes = 10, static init size = 120B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_39_class_1 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06827428f : 
                        -0.06766601f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.020773081f : 
                        0.0016084048f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.0040683853f : 
                        -3.0287923E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.0030803762f : 
                        4.999156E-4f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06682171f : 
                        -0.06682529f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06681283f : 
                        -0.06681543f)) : 
                -0.06681283f)) : 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.068112224f : 
                        -0.008871138f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.06797096f : 
                        0.008277032f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.0048044724f : 
                        -0.0023347079f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -6.041244E-4f : 
                        0.0010282339f))) : 
            0.0011592532f));
    return pred;
  } // constant pool size = 131B, number of visited nodes = 21, static init size = 270B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {14, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {4, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {12, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_39_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.007806675f : 
                        -0.019346317f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0058387066f : 
                        0.0021534385f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0053989985f : 
                        -0.0019733505f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.013199468f : 
                        0.00614007f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.002126091f : 
                        -0.0015477395f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0051913485f : 
                        0.002487029f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        9.629177E-4f : 
                        -0.0021414948f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.01026372f : 
                        -8.68514E-4f)))) : 
         (data[0 /* Zip Code */] <100004.5f ? 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.066959634f : 
                        0.066962115f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.06696854f : 
                        0.06697201f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.006571528f : 
                        -0.0024150196f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0026530663f : 
                        0.004014365f))) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -2.8020015E-4f : 
                        -0.005537553f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.003787126f : 
                        -0.001163661f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                        0.06696211f : 
                        0.06697197f) : 
                    0.066959634f))));
    return pred;
  } // constant pool size = 192B, number of visited nodes = 30, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {8, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {9, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {3, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_40 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_40_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_40_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_40_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_40_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06679457f : 
                        -0.066794455f) : 
                    -0.06679457f) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06679455f : 
                        -0.06679443f) : 
                    -0.06679457f)) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.001963107f : 
                        3.952068E-4f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.006676229f : 
                        0.0021489058f)) : 
                5.0807785E-4f)) : 
        9.978003E-4f);
    return pred;
  } // constant pool size = 66B, number of visited nodes = 11, static init size = 120B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_40_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100005.5f ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[2])) ? 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[1])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.0056153736f : 
                        -0.010741063f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.006818268f : 
                        -0.0019152545f)) : 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.012409313f : 
                        -0.0018044749f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0042315577f : 
                        0.0022651956f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.006039947f : 
                        -0.0038214037f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.0015972822f : 
                        0.0056679253f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[3])) ? 
                        -0.010943494f : 
                        -0.06679484f) : 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[3])) ? 
                        -0.06679754f : 
                        0.0016288037f)))) : 
         (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[3])) ? 
            -0.0020153797f : 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -0.0065921163f : 
                        -6.9727225E-4f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                        -8.532357E-4f : 
                        0.001358531f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                        0.0013920128f : 
                        0.009477504f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        -5.138681E-4f : 
                        0.0020630665f)))));
    return pred;
  } // constant pool size = 173B, number of visited nodes = 24, static init size = 450B
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {4, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {10, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {3, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {6, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {8, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {4, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_40_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100004.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.005622468f : 
                        -0.014604617f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.004678508f : 
                        -0.0105875395f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100005.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.004649931f : 
                        -9.68879E-4f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0054636262f : 
                        -0.0016025597f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0025092275f : 
                        4.6237206E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0015596687f : 
                        0.0061164987f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        9.289768E-4f : 
                        -0.0019508492f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.009574732f : 
                        -7.6769816E-4f)))) : 
         (data[0 /* Zip Code */] <100004.5f ? 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.066922955f : 
                        0.06692512f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.06693073f : 
                        0.06693377f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.006113292f : 
                        -0.002190931f) : 
                    0.0034770572f)) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.0045277714f : 
                        -2.3175884E-4f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.005195771f : 
                        -4.121342E-4f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                        0.066925116f : 
                        0.066933736f) : 
                    0.066922955f))));
    return pred;
  } // constant pool size = 178B, number of visited nodes = 29, static init size = 360B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {5, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {3, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_41 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_41_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_41_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_41_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_41_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.06677856f : 
                        -0.06677856f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.066778556f : 
                        -0.06677844f)) : 
                -0.06677857f) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0019651018f : 
                        3.6273256E-4f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.00644317f : 
                        0.0021976181f)) : 
                3.9623608E-4f)) : 
        8.9107006E-4f);
    return pred;
  } // constant pool size = 62B, number of visited nodes = 10, static init size = 120B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_41_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100005.5f ? 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[2])) ? 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[3])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06786692f : 
                        -0.06761147f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.036674287f : 
                        -0.0040402827f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06679383f : 
                        -0.06679233f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.066797204f : 
                        -0.06679304f))) : 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[3])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.04299894f : 
                        -0.008136829f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        -0.06678688f : 
                        -0.06678057f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        3.5440223E-4f : 
                        0.002815191f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0030183445f : 
                        0.0031205427f)))) : 
         (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[3])) ? 
            -0.0017646299f : 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.006165692f : 
                        -6.63769E-4f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                        -7.674523E-4f : 
                        0.0012089777f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.0013093259f : 
                        0.00884337f) : 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        -0.0014985515f : 
                        0.0014307467f)))));
    return pred;
  } // constant pool size = 173B, number of visited nodes = 24, static init size = 450B
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {9, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {8, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_41_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100004.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.005628185f : 
                        -0.013990073f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.0043657203f : 
                        -0.00991275f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0030643677f : 
                        0.0047698272f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.004935946f : 
                        -0.0021574441f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0018898402f : 
                        -0.0013389724f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0047342204f : 
                        0.0021424564f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        9.2356425E-4f : 
                        -0.0017881566f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.008937413f : 
                        -6.3405203E-4f)))) : 
         (data[0 /* Zip Code */] <100004.5f ? 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.06689866f : 
                        0.06690076f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.06690502f : 
                        0.06690841f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.005795371f : 
                        -0.0019573646f) : 
                    0.003369498f)) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        2.7272498E-4f : 
                        -0.003675545f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.004918206f : 
                        -3.9232936E-4f)) : 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.066892765f : 
                        0.066898376f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.06690838f : 
                        0.066898376f)))));
    return pred;
  } // constant pool size = 187B, number of visited nodes = 30, static init size = 390B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {4, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {3, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {9, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {5, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {3, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_42 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_42_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_42_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_42_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_42_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.066764586f : 
                        -0.066764586f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.06676458f : 
                        -0.06676458f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.06676454f : 
                        -0.06676458f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[2])) ? 
                        -0.06676456f : 
                        -0.066764556f))) : 
             (data[0 /* Zip Code */] <100005.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.0021186676f : 
                        5.02721E-4f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.006102414f : 
                        0.0021668095f)) : 
                2.8523715E-4f)) : 
        8.306136E-4f);
    return pred;
  } // constant pool size = 84B, number of visited nodes = 13, static init size = 180B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {11, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_42_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100005.5f ? 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[2])) ? 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[3])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06778687f : 
                        -0.067548394f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.03541555f : 
                        -0.0037139654f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06677794f : 
                        -0.066776626f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.066780895f : 
                        -0.06677725f))) : 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[3])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.06772196f : 
                        -0.010358733f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        -0.06677186f : 
                        -0.06676634f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        3.0455537E-4f : 
                        0.002571738f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.003803615f : 
                        0.0010237187f)))) : 
         (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[3])) ? 
            -0.0015525504f : 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                        -0.005748388f : 
                        -6.321099E-4f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                        -6.9057674E-4f : 
                        0.0010836109f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[1])) ? 
                        0.0012059183f : 
                        0.008268678f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        -5.6295824E-4f : 
                        0.0018480064f)))));
    return pred;
  } // constant pool size = 178B, number of visited nodes = 24, static init size = 480B
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {9, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {6, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {8, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {4, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_42_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.009005045f : 
                        -0.0019541366f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.0066035646f : 
                        -1.8947586E-4f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.004418669f : 
                        -0.0013568148f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.011856405f : 
                        0.0066904454f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0021952072f : 
                        4.5685493E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0012448669f : 
                        0.005557091f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        8.897935E-4f : 
                        -0.0016265289f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.008325324f : 
                        -5.3308817E-4f)))) : 
         (data[0 /* Zip Code */] <100004.5f ? 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.066869624f : 
                        0.066871464f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0668752f : 
                        0.06687816f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0054406547f : 
                        -0.001878185f) : 
                    0.0032230006f)) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        3.1715407E-4f : 
                        -0.005635142f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.0013356578f : 
                        0.0137707945f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                        0.066864476f : 
                        0.06687813f) : 
                    0.06687641f))));
    return pred;
  } // constant pool size = 188B, number of visited nodes = 29, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_43 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_43_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_43_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_43_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_43_class_0 {
  static final double score0(double[] data) {
    double pred =      (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                    -0.06675235f : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.066752344f : 
                        -0.06675234f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[2])) ? 
                        -0.06675236f : 
                        -0.06675235f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.066752255f : 
                        -0.06675234f))) : 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.0035601114f : 
                        -9.127754E-4f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        0.002545f : 
                        8.4643345E-4f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.009257738f : 
                        0.0029893394f) : 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        0.00266125f : 
                        -0.0010329295f)))) : 
        7.734139E-4f);
    return pred;
  } // constant pool size = 92B, number of visited nodes = 15, static init size = 180B
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {14, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {7, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_43_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100005.5f ? 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[2])) ? 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[3])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06794893f : 
                        0.0017217365f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.013928373f : 
                        0.0029697404f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.066764034f : 
                        -0.06676289f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.06676662f : 
                        -0.06676343f))) : 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[3])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.052857686f : 
                        -0.013012847f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        -0.066758715f : 
                        -0.06675389f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        2.482663E-4f : 
                        0.0023599127f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0027280094f : 
                        0.0028014074f)))) : 
         (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[3])) ? 
            -0.0013522547f : 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                        -0.005753214f : 
                        -0.0012889282f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[2])) ? 
                        -6.198524E-4f : 
                        0.0010062981f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[2])) ? 
                        -4.2036801E-4f : 
                        0.0061656814f) : 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        -0.0014580175f : 
                        0.0012428324f)))));
    return pred;
  } // constant pool size = 178B, number of visited nodes = 24, static init size = 480B
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {9, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {6, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {5, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_43_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.008424421f : 
                        -0.0017724556f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.0061426335f : 
                        -1.0851124E-4f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0025373981f : 
                        0.004614385f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.004355311f : 
                        -0.0017540879f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.0011488823f : 
                        0.0017125286f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0042377342f : 
                        0.0018016401f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.0030126818f : 
                        3.1077472E-4f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.0077584335f : 
                        -4.2660235E-4f)))) : 
         (data[0 /* Zip Code */] <100004.5f ? 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.06684424f : 
                        0.06684585f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.066849105f : 
                        0.0668517f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0019880822f : 
                        -0.005311459f) : 
                    0.0030749568f)) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        2.7876731E-4f : 
                        -0.005298473f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.001226697f : 
                        0.012737736f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                        0.06683973f : 
                        0.066851676f) : 
                    0.06685676f))));
    return pred;
  } // constant pool size = 188B, number of visited nodes = 29, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {4, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {3, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {9, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_44 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_44_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_44_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_44_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_44_class_0 {
  static final double score0(double[] data) {
    double pred =     0.0f;
    return pred;
  } // constant pool size = 2B, number of visited nodes = 0, static init size = 0B
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_44_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100005.5f ? 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[2])) ? 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[3])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06771334f : 
                        -0.0674349f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.033301458f : 
                        -0.0028349326f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06675187f : 
                        -0.06675087f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.06675413f : 
                        -0.066751346f))) : 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[3])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        -0.067629576f : 
                        -0.008631986f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        -0.06674722f : 
                        -0.066742994f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        2.1054414E-4f : 
                        0.0021648526f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        -0.0025934316f : 
                        0.0025769733f)))) : 
         (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[3])) ? 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                -0.06676397f : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.00182511f : 
                        1.5736194E-4f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        -0.0030364292f : 
                        0.001399761f))) : 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[2])) ? 
                        -0.005442733f : 
                        -0.0011938537f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[2])) ? 
                        -5.3487613E-4f : 
                        9.280436E-4f)) : 
                 (data[0 /* Zip Code */] <100006.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                        7.64763E-4f : 
                        0.0074062673f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[1])) ? 
                        -5.905781E-4f : 
                        0.0016371802f)))));
    return pred;
  } // constant pool size = 204B, number of visited nodes = 28, static init size = 540B
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {14, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {9, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {6, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {6, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {5, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {6, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {4, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_44_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.007878248f : 
                        -0.0015863695f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                        -0.005750667f : 
                        -3.771139E-5f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0022938466f : 
                        0.004327842f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.0040364442f : 
                        -0.0015820595f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0019322882f : 
                        3.14479E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        9.036616E-4f : 
                        0.0049943705f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.0028277596f : 
                        3.2515152E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        -0.0020429979f : 
                        0.004541915f)))) : 
         (data[0 /* Zip Code */] <100003.5f ? 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                 (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0668222f : 
                        0.06682194f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        0.06682603f : 
                        0.06682704f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                    0.0029620994f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                        -6.2063016E-4f : 
                        0.002864838f))) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        5.284081E-4f : 
                        -0.008913529f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -3.1976035E-4f : 
                        0.0069539906f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[2])) ? 
                        0.066820726f : 
                        0.06682855f) : 
                    0.06683915f))));
    return pred;
  } // constant pool size = 193B, number of visited nodes = 29, static init size = 450B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {4, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {3, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {8, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {5, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_45 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_45_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_45_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_45_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_45_class_0 {
  static final double score0(double[] data) {
    double pred =     0.0f;
    return pred;
  } // constant pool size = 2B, number of visited nodes = 0, static init size = 0B
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_45_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100005.5f ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[2])) ? 
             (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[1])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.004027577f : 
                        -0.009384575f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.004840464f : 
                        -0.0010053932f)) : 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.010177667f : 
                        -6.267433E-4f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.003579483f : 
                        0.0030530212f))) : 
            -1.20166704E-4f) : 
         (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
             (data[0 /* Zip Code */] <100006.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                        -0.008012472f : 
                        -0.0016815115f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                        -0.0015322241f : 
                        3.6550994E-4f)) : 
                 (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[3])) ? 
                     (data[0 /* Zip Code */] <100008.5f ? 
                        -0.0033276887f : 
                        -7.3450437E-4f) : 
                     (data[0 /* Zip Code */] <100007.5f ? 
                        0.0015978715f : 
                        9.923141E-5f))) : 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.0012658299f : 
                        -0.0018575082f) : 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[3])) ? 
                        -0.0667518f : 
                        0.0015941713f)) : 
                 (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[3])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        2.5928979E-5f : 
                        0.002754178f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.0084094675f : 
                        0.0011623012f)))));
    return pred;
  } // constant pool size = 163B, number of visited nodes = 24, static init size = 390B
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {4, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {10, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {2, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {6, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {8, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_45_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100006.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.0053587123f : 
                        -0.001273904f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0039883186f : 
                        0.0014945203f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.012194234f : 
                        -0.0070338175f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[2])) ? 
                        -0.007635999f : 
                        0.007336207f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.0012614711f : 
                        0.0014854234f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0037551655f : 
                        0.0014471019f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        9.620221E-4f : 
                        -0.0015039097f) : 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        0.0074043036f : 
                        -4.5293046E-4f)))) : 
         (data[0 /* Zip Code */] <100004.5f ? 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.066807136f : 
                        0.06680837f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.06681086f : 
                        0.06681284f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0017392974f : 
                        -0.0052124113f) : 
                    0.0027539048f)) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.0044075707f : 
                        -7.288211E-5f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.003252045f : 
                        -0.001162205f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[2])) ? 
                        0.06680369f : 
                        0.06681283f) : 
                    0.06682212f))));
    return pred;
  } // constant pool size = 193B, number of visited nodes = 29, static init size = 450B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {5, 0, 0, 0};
  // {01010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {10, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {8, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {4, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {9, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {5, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {3, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_46 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_46_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_46_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_46_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_46_class_0 {
  static final double score0(double[] data) {
    double pred =     0.0f;
    return pred;
  } // constant pool size = 2B, number of visited nodes = 0, static init size = 0B
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_46_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100005.5f ? 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[2])) ? 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[3])) ? 
                 (data[0 /* Zip Code */] <100002.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.067634396f : 
                        -0.06738091f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.011908269f : 
                        0.0020494189f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.066736296f : 
                        -0.066735126f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.06673823f : 
                        -0.06673564f))) : 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[3])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.051455084f : 
                        -0.011243226f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                        -0.06673259f : 
                        -0.066729136f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        2.3679706E-4f : 
                        0.0020375145f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0032740405f : 
                        7.1158865E-4f)))) : 
        1.3059679E-4f);
    return pred;
  } // constant pool size = 121B, number of visited nodes = 16, static init size = 330B
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {13, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {9, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {6, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_46_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.004942428f : 
                        -0.015690124f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0029983877f : 
                        0.0047379597f)) : 
                 (data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0018450277f : 
                        0.004118209f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.0036105057f : 
                        -0.0012206251f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0013733765f : 
                        -0.0015058973f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.003497002f : 
                        0.0013390137f)) : 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.0027694695f : 
                        3.359237E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        -0.0020763627f : 
                        0.004303079f)))) : 
         (data[0 /* Zip Code */] <100004.5f ? 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.06679805f : 
                        0.0667992f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.06680117f : 
                        0.06680329f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.004702161f : 
                        -0.0018405265f) : 
                    0.0025581515f)) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100005.5f ? 
                        -0.0041348245f : 
                        -7.4755146E-5f) : 
                     (data[0 /* Zip Code */] <100006.5f ? 
                        0.0030135405f : 
                        -0.0010923591f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                        0.06679483f : 
                        0.066803284f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.06681193f : 
                        0.066809475f)))));
    return pred;
  } // constant pool size = 192B, number of visited nodes = 30, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {4, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {3, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {9, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {1, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {11000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {3, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_47 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_47_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_47_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_47_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_47_class_0 {
  static final double score0(double[] data) {
    double pred =     0.0f;
    return pred;
  } // constant pool size = 2B, number of visited nodes = 0, static init size = 0B
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_47_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100002.5f ? 
         (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[1])) ? 
             (data[0 /* Zip Code */] <100001.5f ? 
                 (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[3])) ? 
                        -0.0067271413f : 
                        -0.06672531f) : 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[3])) ? 
                        -0.067671396f : 
                        0.006537677f)) : 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[2])) ? 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[3])) ? 
                        -0.009929518f : 
                        -0.0676424f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                        -0.007417515f : 
                        0.0018609195f))) : 
             (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[3])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100001.5f ? 
                        -0.06741689f : 
                        -0.06740338f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[2])) ? 
                        -0.06672717f : 
                        -0.06672416f)) : 
                 (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.0031144517f : 
                        -0.0074216756f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100001.5f ? 
                        -8.494332E-4f : 
                        0.012988808f)))) : 
         (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[1])) ? 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[3])) ? 
                        -0.0067381365f : 
                        -0.068208f) : 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[3])) ? 
                        -0.06772201f : 
                        0.0056336774f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[1])) ? 
                        -0.0019197722f : 
                        1.021099E-6f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                        -0.0021425395f : 
                        0.0034708697f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[3])) ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[2])) ? 
                        -0.06672648f : 
                        0.032666847f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[2])) ? 
                        0.0035920022f : 
                        0.026824487f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[2])) ? 
                        -5.719922E-4f : 
                        0.0021185142f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[2])) ? 
                        -0.0051460983f : 
                        0.0053072446f)))));
    return pred;
  } // constant pool size = 236B, number of visited nodes = 31, static init size = 660B
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {12, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {5, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {5, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {14, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {7, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {4, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_47_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -0.006919465f : 
                        -8.023938E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100007.5f ? 
                        -6.671117E-4f : 
                        -0.006239634f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.0031677862f : 
                        -6.335062E-4f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.010053283f : 
                        0.006732846f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        0.0014596003f : 
                        1.2584412E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        3.5363587E-4f : 
                        0.004344649f)) : 
                8.9128145E-5f)) : 
         (data[0 /* Zip Code */] <100003.5f ? 
             (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                 (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[2])) ? 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        0.06678572f : 
                        0.06678553f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        0.06678806f : 
                        0.06678909f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                    0.0023156565f : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -6.682826E-4f : 
                        0.0022319828f))) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        4.7398594E-4f : 
                        -0.008214255f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                        -4.3377583E-4f : 
                        0.006539699f)) : 
                 (data[0 /* Zip Code */] <100005.5f ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[2])) ? 
                        0.06678465f : 
                        0.06679017f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        0.06680255f : 
                        0.06680025f)))));
    return pred;
  } // constant pool size = 180B, number of visited nodes = 27, static init size = 420B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {8, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {7, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {8, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {1, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {8, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {13, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {5, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {9, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_48 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_48_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_48_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_48_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_48_class_0 {
  static final double score0(double[] data) {
    double pred =     0.0f;
    return pred;
  } // constant pool size = 2B, number of visited nodes = 0, static init size = 0B
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_48_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100002.5f ? 
         (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[1])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[3])) ? 
                        -0.06760517f : 
                        0.0060049905f) : 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[3])) ? 
                        -0.009350753f : 
                        -0.0675782f)) : 
                 (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[3])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100001.5f ? 
                        -0.006294551f : 
                        -0.0020896238f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.06671799f : 
                        -0.06672108f))) : 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[2])) ? 
                 (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[3])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[1])) ? 
                        -0.06735193f : 
                        -0.06733165f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.06672012f : 
                        -0.06671912f)) : 
                 (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[3])) ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[2])) ? 
                        -0.06736132f : 
                        -0.06671698f) : 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT11, 32, 0, data[2])) ? 
                        6.6954066E-4f : 
                        0.0055014626f)))) : 
         (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT12, 32, 0, data[1])) ? 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT13, 32, 0, data[1])) ? 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT14, 32, 0, data[3])) ? 
                        -0.0063280244f : 
                        -0.06811191f) : 
                     (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT15, 32, 0, data[3])) ? 
                        -0.06765797f : 
                        0.0052140825f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT16, 32, 0, data[1])) ? 
                        -0.0018154671f : 
                        -1.8350178E-5f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT17, 32, 0, data[1])) ? 
                        -0.0019569893f : 
                        0.0032015191f))) : 
             (data[0 /* Zip Code */] <100003.5f ? 
                 (Double.isNaN(data[3 /* Prime Time? */]) || !GenModel.bitSetIsInRange(32, 0, data[3]) || (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT18, 32, 0, data[3])) ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT19, 32, 0, data[2])) ? 
                        -0.06671901f : 
                        0.029592576f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT20, 32, 0, data[2])) ? 
                        0.003308202f : 
                        0.024505874f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100009.5f ? 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT21, 32, 0, data[2])) ? 
                        -5.155698E-4f : 
                        0.0019173131f) : 
                     (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT22, 32, 0, data[2])) ? 
                        -0.0048441985f : 
                        0.004842079f)))));
    return pred;
  } // constant pool size = 241B, number of visited nodes = 31, static init size = 690B
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {12, 0, 0, 0};
  // {10100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {5, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {1, 0, 0, 0};
  // {00010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {8, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {4, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT11 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT12 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT13 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT14 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT15 = new byte[] {2, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT16 = new byte[] {14, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT17 = new byte[] {7, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT18 = new byte[] {2, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT19 = new byte[] {2, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT20 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT21 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT22 = new byte[] {4, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_48_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (data[0 /* Zip Code */] <100002.5f ? 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                     (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[2])) ? 
                        -0.019793954f : 
                        -0.0012465996f) : 
                     (data[0 /* Zip Code */] <100001.5f ? 
                        -0.002940857f : 
                        0.0051089386f)) : 
                 (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        -0.020750444f : 
                        -0.004062437f) : 
                     (data[0 /* Zip Code */] <100003.5f ? 
                        8.3629705E-4f : 
                        -0.0029819568f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0011645472f : 
                        -3.7938872E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        3.2714035E-4f : 
                        0.004047138f)) : 
                7.585306E-5f)) : 
        0.0019329163f);
    return pred;
  } // constant pool size = 84B, number of visited nodes = 13, static init size = 180B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {11010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {11, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {4, 0, 0, 0};
  // {10110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {13, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
}


class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Forest_49 {
  public static void score0(double[] fdata, double[] preds) {
    preds[1] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_49_class_0.score0(fdata);
    preds[2] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_49_class_1.score0(fdata);
    preds[3] += gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_49_class_2.score0(fdata);
  }
}
class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_49_class_0 {
  static final double score0(double[] data) {
    double pred =     0.0f;
    return pred;
  } // constant pool size = 2B, number of visited nodes = 0, static init size = 0B
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_49_class_1 {
  static final double score0(double[] data) {
    double pred =      (data[0 /* Zip Code */] <100005.5f ? 
         (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[2])) ? 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[3])) ? 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[1])) ? 
                        -0.06780226f : 
                        0.0016849214f) : 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.0123974895f : 
                        0.004034116f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                        -0.06671661f : 
                        -0.06671549f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT5, 32, 0, data[1])) ? 
                        -0.06672511f : 
                        -0.06672281f))) : 
             (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT6, 32, 0, data[3])) ? 
                 (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT7, 32, 0, data[2])) ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT8, 32, 0, data[1])) ? 
                        -0.049487066f : 
                        -0.009487298f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        -0.06671411f : 
                        -0.06671943f)) : 
                 (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100004.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT9, 32, 0, data[1])) ? 
                        1.7190576E-4f : 
                        0.0018812711f) : 
                     (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT10, 32, 0, data[1])) ? 
                        -0.0023830864f : 
                        0.0018629131f)))) : 
        6.704947E-5f);
    return pred;
  } // constant pool size = 121B, number of visited nodes = 16, static init size = 330B
  // {01100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {6, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {2, 0, 0, 0};
  // {00110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {12, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {4, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT5 = new byte[] {1, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT6 = new byte[] {2, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT7 = new byte[] {4, 0, 0, 0};
  // {01110000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT8 = new byte[] {14, 0, 0, 0};
  // {10010000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT9 = new byte[] {9, 0, 0, 0};
  // {01000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT10 = new byte[] {2, 0, 0, 0};
}

class gbm_b895d0cd_0e08_4f00_9036_dffcecf110bf_Tree_49_class_2 {
  static final double score0(double[] data) {
    double pred =      (!Double.isNaN(data[3 /* Prime Time? */]) && (GenModel.bitSetIsInRange(32, 0, data[3]) && !GenModel.bitSetContains(GRPSPLIT0, 32, 0, data[3])) ? 
         (Double.isNaN(data[2 /* Connection Type */]) || !GenModel.bitSetIsInRange(32, 0, data[2]) || (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT1, 32, 0, data[2])) ? 
             (!Double.isNaN(data[2 /* Connection Type */]) && (GenModel.bitSetIsInRange(32, 0, data[2]) && !GenModel.bitSetContains(GRPSPLIT2, 32, 0, data[2])) ? 
                 (data[0 /* Zip Code */] <100004.5f ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        -0.0024450915f : 
                        -0.010851427f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100008.5f ? 
                        -0.001711756f : 
                        -0.0070571695f)) : 
                 (data[0 /* Zip Code */] <100001.5f ? 
                     (!Double.isNaN(data[1 /* High Speed Internet Plan */]) && (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT3, 32, 0, data[1])) ? 
                        -0.01680773f : 
                        4.1859786E-4f) : 
                     (data[0 /* Zip Code */] <100002.5f ? 
                        0.0029637646f : 
                        -0.001788775f))) : 
             (data[0 /* Zip Code */] <100004.5f ? 
                 (Double.isNaN(data[1 /* High Speed Internet Plan */]) || !GenModel.bitSetIsInRange(32, 0, data[1]) || (GenModel.bitSetIsInRange(32, 0, data[1]) && !GenModel.bitSetContains(GRPSPLIT4, 32, 0, data[1])) ? 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100003.5f ? 
                        0.0010789293f : 
                        -3.5602762E-4f) : 
                     (Double.isNaN(data[0]) || data[0 /* Zip Code */] <100002.5f ? 
                        3.0118081E-4f : 
                        0.003770586f)) : 
                6.380662E-5f)) : 
        0.0017737485f);
    return pred;
  } // constant pool size = 79B, number of visited nodes = 13, static init size = 150B
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT0 = new byte[] {1, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT1 = new byte[] {1, 0, 0, 0};
  // {00100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT2 = new byte[] {4, 0, 0, 0};
  // {11100000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT3 = new byte[] {7, 0, 0, 0};
  // {10000000 00000000 00000000 00000000}
  public static final byte[] GRPSPLIT4 = new byte[] {1, 0, 0, 0};
}


