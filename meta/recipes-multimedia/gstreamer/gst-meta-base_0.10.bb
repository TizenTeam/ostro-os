DESCRIPTION = "Gstreamer package groups"
LICENSE = "MIT"
DEPENDS = "gstreamer gst-plugins-base gst-plugins-good gst-plugins-bad"

PR = "r7"

PACKAGES = "\
    gst-meta-base \
    gst-meta-audio \
    gst-meta-debug \
    gst-meta-video"

ALLOW_EMPTY = "1"

RDEPENDS_gst-meta-base = "\
    gstreamer \
    gst-plugins-base-playbin \
    gst-plugins-base-decodebin \
    gst-plugins-base-gnomevfs \
    gst-plugins-base-alsa \
    gst-plugins-base-volume \
    gst-plugins-base-ximagesink \
    gst-plugins-base-audioconvert \
    gst-plugins-base-audioresample \
    gst-plugins-base-typefindfunctions \
    gst-plugins-base-videoscale \
    gst-plugins-base-ffmpegcolorspace \
    gst-plugins-good-autodetect"


RDEPENDS_gst-meta-audio = "\
    gst-meta-base \
    gst-plugins-base-vorbis \
    gst-plugins-base-ogg \
    gst-plugins-good-wavparse \
    gst-plugins-good-flac \
    ${COMMERCIAL_AUDIO_PLUGINS}"


RDEPENDS_gst-meta-debug = "\
    gst-meta-base \
    gst-plugins-good-debug \
    gst-plugins-base-audiotestsrc \
    gst-plugins-base-videotestsrc"


RDEPENDS_gst-meta-video = "\
    gst-meta-base \
    gst-plugins-good-avi \
    gst-plugins-good-matroska \
    ${COMMERCIAL_VIDEO_PLUGINS}"

RRECOMMENDS_gst-meta-video = "\
    gst-meta-audio"
