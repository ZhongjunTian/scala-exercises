import org.apache.spark.{SparkConf, SparkContext}

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("HelloWorld").setMaster("local").setSparkHome("/usr/lib/spark/spark-2.1.1-bin-hadoop2.7");
    val sc = new SparkContext(conf)
    // setMaster指定Master
    // setSparkHome指向安装spark的地址，视环境而定

    val data = sc.textFile("README.md")
    // 加载README.md文件并创建RDD
    data.foreach(println)
    // 输出RDD中的每个分区的内容
  }
}
