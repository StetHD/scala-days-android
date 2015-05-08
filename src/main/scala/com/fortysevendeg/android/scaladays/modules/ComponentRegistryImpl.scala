/*
 * Copyright (C) 2015 47 Degrees, LLC http://47deg.com hello@47deg.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may
 *  not use this file except in compliance with the License. You may obtain
 *  a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.fortysevendeg.android.scaladays.modules

import com.fortysevendeg.android.scaladays.modules.analytics.impl.AnalyticsServicesComponentImpl
import com.fortysevendeg.android.scaladays.modules.json.impl.JsonServicesComponentImpl
import com.fortysevendeg.android.scaladays.modules.net.impl.NetServicesComponentImpl
import com.fortysevendeg.android.scaladays.modules.preferences.impl.PreferenceServicesComponentImpl
import com.fortysevendeg.android.scaladays.modules.twitter.impl.TwitterServicesComponentImpl
import com.fortysevendeg.android.scaladays.commons.ContextWrapperProvider

trait ComponentRegistryImpl
    extends ComponentRegistry
    with ContextWrapperProvider
    with PreferenceServicesComponentImpl
    with NetServicesComponentImpl
    with JsonServicesComponentImpl
    with TwitterServicesComponentImpl
    with AnalyticsServicesComponentImpl
