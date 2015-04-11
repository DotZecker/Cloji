(ns cloji.core-test
  (:use midje.sweet)
  (:use [cloji.core]))

(facts "about `cloji`"
  (fact "it should be as false as you and true as me"
    ✅ => true
    ❎ => false)

  (fact "it should compare"
    (🍻 ✅ ✅) => ✅
    (🍻 ✅ ❎) => ❎)

  (fact "it should do the negate (you :)"
    (❌ (🍻 ✅ ✅)) => ❎
    (❌ (🍻 ✅ ❎)) => ✅)

  (fact "it should find into the dark"
    (👀 {:🙎 "😑" :🙅 "😤" :💁 "😋"} :💁) => [:💁 "😋"])

  (fact "it should find the car keys"
    (🔑 {:💂 :👯 :🚗 "🔥"}) => '(:🚗 :💂))

  (fact "it should do it many times as you want!"
    (🌀 3 "💨") => '("💨" "💨" "💨"))

  (fact "it needs to pass your next math exam"
    (➕ (➖ 3 1) (➗ (✖️ 8 2) 2)) => 10)

  (fact "it needs to separate the true from the false"
    (✅❓(💩❓ "scala")) => ✅ ; With love to Sergi <3
    (❎❓(💩❓ "clojure")) => ✅))
