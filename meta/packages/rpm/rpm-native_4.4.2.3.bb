require rpm_${PV}.bb
inherit native

DEPENDS = "beecrypt-native zlib-native file-native popt-native python-native"

export varprefix = "${localstatedir}"
