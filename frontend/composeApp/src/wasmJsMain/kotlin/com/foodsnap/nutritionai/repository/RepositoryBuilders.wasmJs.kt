package com.foodsnap.nutritionai.repository

actual fun getUserRepository(): UserRepository = MockUserRepository()
actual fun getFoodLogRepository(): FoodLogRepository = MockFoodLogRepository()
actual fun getWaterRepository(): WaterRepository = MockWaterRepository()
actual fun getChatRepository(): ChatRepository = MockChatRepository()
actual fun getCurrentTimestamp(): String = "1718684200000"
