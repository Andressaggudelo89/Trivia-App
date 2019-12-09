/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        //  Navigation Controller has a UI library called `NavigationUI`.
        //  It integrates with the Action Bar to implement the correct behavior for the UP Button
        //
        //  To find the NavController in this activity, the `findNavController` method
        //  This method takes the Activity and NavHostFragment params

        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navController)

        //  Override the method that controls Navigation Up:

    }

    override fun onSupportNavigateUp(): Boolean {
        //return super.onSupportNavigateUp()

        //  Here is where we handle what happens when Up Button is pressed.
        //  If we do not override this method, nothing happends when Up Button is pressed.
        val navController = this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()       //  That's it
    }
}
