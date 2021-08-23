import 'dart:math';

import 'package:flutter/material.dart';
import 'package:get/get.dart';

String getRandomYesNo() {
    var rng = new Random();
    int randomNumber = rng.nextInt(1);
    String palavra = "Yes";
    if (randomNumber == 1) {
      palavra = "No";
    }
    return palavra;
  }