/*
 * Copyright (C) 2015 47 Degrees, LLC http://47deg.com hello@47deg.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortysevendeg.android.scaladays.ui.commons

import android.support.v7.widget.{RecyclerView, Toolbar}
import android.view.ViewGroup.LayoutParams._
import android.view.{ViewGroup, Gravity}
import android.widget._
import com.fortysevendeg.android.scaladays.R
import macroid.extras.FrameLayoutTweaks._
import macroid.extras.LinearLayoutTweaks._
import macroid.extras.ViewTweaks._
import macroid.extras.RecyclerViewTweaks._
import macroid.extras.TextViewTweaks._
import macroid.extras.ResourcesExtras._
import macroid.{Tweak, ContextWrapper}
import macroid.FullDsl._

import scala.language.postfixOps

trait ToolbarStyles {

  def toolbarStyle(height: Int)(implicit context: ContextWrapper): Tweak[Toolbar] =
    vContentSizeMatchWidth(height) +
      vBackground(R.color.primary)

}

trait PlaceHolderStyles {

  val placeholderContentStyle: Tweak[LinearLayout] =
    vWrapContent +
      flLayoutGravity(Gravity.CENTER) +
      llGravity(Gravity.CENTER_HORIZONTAL) +
      llVertical +
      vGone

  val placeholderImageStyle: Tweak[ImageView] =
    vWrapContent

  def placeholderMessageStyle(implicit context: ContextWrapper): Tweak[TextView] =
    vWrapContent +
      tvGravity(Gravity.CENTER) +
      tvColorResource(R.color.text_error_message) +
      tvSizeResource(R.dimen.text_big) +
      vPaddings(resGetDimensionPixelSize(R.dimen.padding_default_big))

  def placeholderButtonStyle(implicit context: ContextWrapper): Tweak[TextView] =
    vWrapContent +
      vMinWidth(resGetDimensionPixelSize(R.dimen.width_button)) +
      tvText(R.string.reload) +
      tvColorResource(R.color.text_error_button) +
      vBackground(R.drawable.background_error_button) +
      tvAllCaps() +
      tvSizeResource(R.dimen.text_medium) +
      tvGravity(Gravity.CENTER)

}

trait HeaderAdapterStyles {

  def headerContentStyle(implicit context: ContextWrapper): Tweak[LinearLayout] =
    lp[ViewGroup](MATCH_PARENT, resGetDimensionPixelSize(R.dimen.height_header)) +
      llHorizontal +
      vBackgroundColorResource(R.color.background_list_schedule_header)

  def headerNameStyle(implicit context: ContextWrapper): Tweak[TextView] =
    vWrapContent +
      tvSizeResource(R.dimen.text_medium) +
      llLayoutGravity(Gravity.CENTER_VERTICAL) +
      tvColorResource(R.color.text_schedule_name) +
      tvBold +
      tvAllCaps() +
      vPadding(resGetDimensionPixelSize(R.dimen.padding_default), 0, 0, 0)

}

trait ListStyles {

  def rootStyle(implicit context: ContextWrapper): Tweak[FrameLayout] = vMatchParent

  val recyclerViewStyle: Tweak[RecyclerView] =
    vMatchParent +
      rvNoFixedSize

  val progressBarStyle: Tweak[ProgressBar] =
    vWrapContent +
      flLayoutGravity(Gravity.CENTER)
}