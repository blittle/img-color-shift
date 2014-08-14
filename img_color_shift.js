;(function(){
"undefined" !== typeof Math.imul && Math.imul.call(null, 4294967295, 5);
function a() {
  return document.write("\x3cp\x3eHello, ClojureScript compiler!\x3c/p\x3e");
}
var b = ["img_color_shift", "core", "main"], c = this;
b[0] in c || !c.execScript || c.execScript("var " + b[0]);
for (var d;b.length && (d = b.shift());) {
  var e;
  if (e = !b.length) {
    e = void 0 !== a;
  }
  e ? c[d] = a : c = c[d] ? c[d] : c[d] = {};
}
;
})();
