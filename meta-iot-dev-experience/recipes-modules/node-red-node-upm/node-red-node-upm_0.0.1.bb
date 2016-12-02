DESCRIPTION = "Node-RED nodes to talk to sensors supported by the UPM library"
LICENSE = "MIT"
SUMMARY = "Node-RED nodes to talk to sensors supported by the UPM library"
SECTION = "devel/node"
HOMEPAGE = "github.com/w4ilun/Node-Red-Node-UPM"
PR = "r1.0"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = 	"file://LICENSE.md \
                 file://node-red-node-upm-0.0.1.tar.gz"

LIC_FILES_CHKSUM = "file://${THISDIR}/files/LICENSE.md;md5=187ed96789675b0c4f200a7070d2a5c1"

S = "${WORKDIR}/node_modules/"

do_install_append () {
    install -d ${D}/usr/lib/node_modules/node-red-node-upm
    cp -a -R ${S}/node-red-node-upm ${D}/usr/lib/node_modules
}


FILES_${PN} = "/usr/lib"

RDEPENDS_${PN} = "node-red upm mraa"
