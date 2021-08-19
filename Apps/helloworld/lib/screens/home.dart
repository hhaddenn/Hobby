import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:helloworld/controllers/counterController.dart';

import 'other.dart';

class HomeScreen extends StatelessWidget {
  final CounterController counterController = Get.put(CounterController());
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Obx(
        () => Column(mainAxisAlignment: MainAxisAlignment.center, children: [
          Center(
              child: Text(
            "Clicks: ${counterController.counter.value}",
            style: TextStyle(fontSize: 50),
          )),
          SizedBox(height: 10),
          Center(
            child: ElevatedButton(
                onPressed: () {
                  print("CLICK");
                  () => Get.to(OtherScreen());
                },
                child: Text("Open other screen")),
          )
        ]),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          counterController.increment();
        },
        child: Icon(Icons.add),
      ),
    );
  }
}