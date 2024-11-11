package org.apache.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.rules.Rule
import org.apache.spark.sql.execution.{ColumnarRule, SparkPlan}

class ColumnarRuleDemo(ss: SparkSession) extends ColumnarRule {
  override def preColumnarTransitions: Rule[SparkPlan] = super.preColumnarTransitions

  override def postColumnarTransitions: Rule[SparkPlan] = super.postColumnarTransitions
}
