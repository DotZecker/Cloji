(ns cloji.core)

(def ✅ true)
(def ❎ false)

(def 🍻 =)
(def ❌ not)

(def 👀 find)
(def 🔑 keys)
(def 🌀 repeat)

(def ➕ +)
(def ➖ -)
(def ➗ quot)
(def ✖️ *)

(defn ✅❓[💭]
    (🍻 💭 ✅))
(defn ❎❓[💭]
    (❌ (✅❓ 💭)))

(def 💩 "scala")
(defn 💩❓ [💭] (🍻 💭 💩))
