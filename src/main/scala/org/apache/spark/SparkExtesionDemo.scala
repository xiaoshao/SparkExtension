package org.apache.spark

import org.apache.spark.internal.Logging
import org.apache.spark.sql.SparkSessionExtensions
import org.apache.spark.sql.execution.ColumnarRule

class SparkExtesionDemo extends (SparkSessionExtensions => Unit) with Logging{
  override def apply(extension: SparkSessionExtensions): Unit = {
    extension.injectColumnar((sparkSession) =>{
      new ColumnarRuleDemo(sparkSession);
    })
  }
}
